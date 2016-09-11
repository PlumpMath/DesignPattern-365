package factory;

import fruit.Fruit;
import vegetable.Vegetable;

public abstract class AbstractFactory {
    public abstract Fruit createFruit();
    public abstract Vegetable createVegetable();
}
