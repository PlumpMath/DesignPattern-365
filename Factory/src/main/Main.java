package main;

import factory.AppleFactory;
import factory.FruitFactory;
import factory.OrangeFactory;
import fruit.Fruit;

public class Main {

    public static void main(String[] args) {
        FruitFactory factory1 = new AppleFactory();
        Fruit fruit1 = factory1.create();
        fruit1.name();

        FruitFactory factory2 = new OrangeFactory();
        Fruit fruit2 = factory2.create();
        fruit2.name();
    }
}
