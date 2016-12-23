package strategy;

public class Subtraction implements CalculateStrategy {

    @Override
    public double calculate(double value1, double value2) {
        return value1 - value2;
    }
}
