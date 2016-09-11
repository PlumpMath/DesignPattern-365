package strategy;

public class Calculate {

    private CalculateStrategy mCalculateStrategy;

    public Calculate(CalculateStrategy calculateStrategy) {
        mCalculateStrategy = calculateStrategy;
    }

    public double getResult(double arg1, double arg2) {
        return mCalculateStrategy.calculate(arg1, arg2);
    }
}
