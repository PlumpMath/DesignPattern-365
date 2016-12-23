package main;

import factory.AbstractFactory;
import factory.Factory1;
import factory.Factory2;
import fruit.Fruit;
import vegetable.Vegetable;

public class Main {

    public static void main(String[] args) {

        AbstractFactory factory1 = new Factory1();
        Fruit fruit1 = factory1.createFruit();
        Vegetable vegetable1 = factory1.createVegetable();
        fruit1.name();
        vegetable1.title();

        AbstractFactory factory2 = new Factory2();
        Fruit fruit2 = factory2.createFruit();
        Vegetable vegetable2 = factory2.createVegetable();
        fruit2.name();
        vegetable2.title();
    }
}
