package com.geekbrain;

//Создать классы Собака и Кот с наследованием от класса Животное.
//Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
//Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
class Animal {

    public String name;
    public int run;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println();

    }
}

//cat
class Cat extends Animal {

    protected boolean swim;
    int run;

    public Cat(String name, int run, boolean swim, int jump) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public void catInfo() {
        System.out.println("CatName: " + name + " /RunLimit: " + run+ " meters/" + " /Sweem:" + swim " meters/");
    }
}

//dog
class Dog extends Animal {

    public double swim;
    public int run;

    public Dog(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }
    public void dogInfo() {
        System.out.println("DogName: " + name  + " /RunLimit: " + run+ " meters/" + " /Sweem:" + swim " meters/");
    }
}
//У каждого животного есть ограничения на действия
//(бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.)
public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Cats");
        Cat cat = new Cat("Barsik", 200, false);
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Animal danimal = new Animal("Dogs");
        Dog dog = new Dog("Sharik", 500, 10,);
        danimal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();

    }
}
