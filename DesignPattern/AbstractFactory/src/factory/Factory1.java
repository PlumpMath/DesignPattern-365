package factory;

import fruit.Apple;
import fruit.Fruit;
import vegetable.Cucumber;
import vegetable.Vegetable;

public class Factory1 extends AbstractFactory {

    @Override
    public Fruit createFruit() {
        return new Apple();
    }

    @Override
    public Vegetable createVegetable() {
        return new Cucumber();
    }
}
