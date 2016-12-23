package main;

import strategy.Addition;
import strategy.Subtraction;

public class Main {

    public static void main(String[] args) {
        System.out.println(new Addition().calculate(5, 3));
        System.out.println(new Subtraction().calculate(5, 3));
    }
}
