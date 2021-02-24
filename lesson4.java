import java.util.Random;
import java.util.Scanner;

    //Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку.
public class lesson4 {
    public static final int SIZE_X = 3;
    public static final int SIZE_Y = 3;
    public static final char PLAYER_DOT = 'X';
    public static final char AI_DOT = 'O';
    public static final char EMPTY_DOT = '.';
    public static final int TO_WIN = 3;

    public static char[][] field = new char[SIZE_Y][SIZE_X];

    public static Scanner sc = new Scanner(System.in);
    public static Random rnd = new Random();

    public static void initFields() {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    public static void printField() {
        System.out.println("-------");
        for (int i = 0; i < SIZE_Y; i++) {
            System.out.print("|");
            for (int j = 0; j < SIZE_X; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-------");
    }

    public static void setSym(int y, int x, char sym) {
        field[y][x] = sym;
    }

    public static void playerStep() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты: X (от 1 до " + SIZE_X + ")   Y  (от 1 до " + SIZE_Y + ")");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));
        setSym(y, x, PLAYER_DOT);
    }
    //Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
    private static boolean checkWin(char sym) {
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (checkLine(i, j, 0, 1,  sym)) return true;
                if (checkLine(i, j, 1, 1,  sym)) return true;
                if (checkLine(i, j, 1, 0,  sym)) return true;
                if (checkLine(i, j, -1, 1, sym)) return true;
            }
        }
        return false;
    }

    //4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
    public static void aiStep() {
        for (int i = 0; i < SIZE_Y; i++)
            for (int j = 0; j < SIZE_X; j++) {
                if (isCellValid(i, j)) {
                    setSym(i, j, AI_DOT);
                    if (checkWin(AI_DOT)) return;
                    setSym(i, j, EMPTY_DOT);
                }
            }
        for (int i = 0; i < SIZE_Y; i++)
            for (int j = 0; j < SIZE_X; j++) {
                if (isCellValid(i, j)) {
                    setSym(i, j, PLAYER_DOT);
                    if (checkWin(PLAYER_DOT)) {
                        setSym(i, j, AI_DOT);
                        return;
                    }
                    setSym(i, j, EMPTY_DOT);
                }
            }

        int x;
        int y;
        do {
            x = rnd.nextInt(SIZE_X);
            y = rnd.nextInt(SIZE_Y);
        } while (!isCellValid(y, x));
        setSym(y, x, AI_DOT);
    }

        public static boolean isCellValid(int y, int x) {
            if (x < 0 || y < 0 || x > SIZE_X - 1 || y > SIZE_Y - 1) {
                return false;
            }
            return field[y][x] == EMPTY_DOT;
        }

        public static boolean isFuelFull() {
            for (int i = 0; i < SIZE_Y; i++) {
                for (int j = 0; j < SIZE_X; j++) {
                    if (field[i][j] == EMPTY_DOT) {
                        return false;
                    }
                }
            }
            return true;
        }