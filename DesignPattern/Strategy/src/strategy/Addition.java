package strategy;

public class Addition implements CalculateStrategy {

    @Override
    public double calculate(double value1, double value2) {
        return value1 + value2;
    }
}
