public class gb_lesson2 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
    //Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0.

    public static void zadanie1(String[] args) {
        int[] mass = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int maxMass = mass.length;

        for(int i = 0; i < maxMass; i++){
            System.out.print (i + "-" + mass[i]+" ");
        }
        System.out.println("");
        for(int i = 0; i < maxMass; i++)
            if(mass[i] == 1) {
                mass[i] = 0;
            }else mass[i] = 1;
        for(int i = 0; i < maxMass; i++){
            System.out.print (i + "-" + mass[i]+" ");
        }}

    //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
            public static void zadanie2(String[] args)
            {
                int[] array = new int[8];
                int j = 0;
                int maxMass = array.length;
                for(int i = 0; i < maxMass; i++)
                {
                    System.out.print (i + "-" + array[i]+" ");
                }
                System.out.println (" ");
                for(int i = 0; i < maxMass; i++, j = j+3)
                {array[i] = j;
                }

                for(int i = 0; i < maxMass; i++)
                {
                    System.out.print (i + "-" + array[i]+" ");
                }
            }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    // числа меньшие 6 умножить на 2

        public static void zadanie3(String[] args)
    {
        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int maxMas = mas.length;

        for(int i = 0; i < maxMas; i++) {
            if (mas[i] < 6) mas[i] = mas[i] * 2;
        }
        for(int i = 0; i < maxMas; i++)
        {
            System.out.print (i + "-" + mas[i]+" ");
        }
    }

    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
    // с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    public static void zadanie4(String args[]) {
        int N = 10;
        int twoD[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            twoD[i][i] = 1;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.printf("%3d",twoD[i][j]);
            System.out.println();
        }
    }

    //* Задать одномерный массив и найти в нем минимальный и максимальный элементы
    public static void zadanie5(String[] args) {
        int[] mas = {8, 18, 1, 2, 32, 87, 123, 22, 55, 11, 1, 2};
        int min = mas[0], max = mas[0], i, imin = 0, imax = 0;
        for(i = 0; i != mas.length; i++)
        {
            if(mas[i] < min){
                min = mas[i];
                imin = i;
            }
            if(mas[i] > max){
                max = mas[i];
                imax = i;
            }
            System.out.println("max = "+max+" min = "+min);
            System.out.println("imax = "+imax+" imin = "+imin);
        }
    }

    
