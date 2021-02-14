package ru.geekbrains.lesson1;

    // Cоздать пустой проект в IntelliJ IDEA и прописать метод main()
    public class Homework1_Sentyurin {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}

    // Создать переменные всех пройденных типов данных и инициализировать их значения;
    public static void Values (){
    byte byteVal = 127;
    short shortVal = 32767;
    int intVal = 10000;
    long longVal = 10000L;
    float floatVal = 13.34f;
    double doubleVal = -50.50;
    char charVal = '*';
    boolean booleanVal = true;
}

    //Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float sum(float a, float b, float c, float d) {
    float x=a*(b+(c/d));
    return x;
}

    //Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах
    // от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static   boolean isSumRange(int a, int b) {
    return 10 <= a+b && a+b <= 20;
}

    //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void isNumber(int a) {
    if(a >= 0) {
        System.out.println("Number" + a + "Positive");
    } else {
        System.out.println("Number" + a + "Negative");
    }
}

    //Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    //если число отрицательное, и вернуть false если положительное.
    public static boolean isNumberNegative(int a) {
        if(a >= 0) {
            return true;
        } else {
            return false;
        }
    }

    //Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void sayHelloToMyLittleFriend(String name){
        System.out.printf("Hello, %s!", name);
    }

    //* Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean isLeapYear(int year){
        return year % 100 !=0 && year % 4 ==0 || year % 400 ==0;
    }
