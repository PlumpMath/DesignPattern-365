package main;

import animal.Cat;
import animal.Dog;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.name();
        cat.eat();
        cat.run();

        Dog dog = new Dog();
        dog.name();
        dog.eat();
        dog.run();
    }
}
