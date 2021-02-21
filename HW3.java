package com.geekbrain;
import java.util.Random;
import java.util.Scanner;

// Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
// После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
public class Homework3 {
    public static void main (String...args){

        Scanner input = new Scanner(System.in);
        Random numbers = new Random();
        int try3 =0;
        int random = numbers.nextInt(9);
        System.out.print("Отгодайте число с трех раз,");

        while (try3 < 3) {
            System.out.print("введите от 0 до 9: ");
            int number = input.nextInt();

            if (number > random) {
                System.out.println("Слишком большое число!");
                System.out.println("");
            } else if (number < random) {
                System.out.println("Слишком малое число!");
                System.out.println("");
            } else if (number == random) {
                System.out.println("Есть попадание!");
                System.out.println("");
            }
            try3++;
        }
        System.out.print("К сожалению, попытки закончились. Играем еще? Да? введите 1; Нет? введите 0:");

        String userData = input.next();
        if(userData.equals("1")){
            main(null);
        }
    }
}
