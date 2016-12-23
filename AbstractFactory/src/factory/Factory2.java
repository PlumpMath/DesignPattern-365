package factory;

import fruit.Fruit;
import fruit.Orange;
import vegetable.Tomato;
import vegetable.Vegetable;

public class Factory2 extends AbstractFactory {

    @Override
    public Fruit createFruit() {
        return new Orange();
    }

    @Override
    public Vegetable createVegetable() {
        return new Tomato();
    }
}
