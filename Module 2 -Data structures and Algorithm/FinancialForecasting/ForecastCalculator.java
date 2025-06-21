package FinancialForecasting;

public class ForecastCalculator {

    // Recursive method to calculate future value
    public static double futureValue(double currentValue, double rate, int years) {
        if (years == 0) return currentValue;
        return (1 + rate) * futureValue(currentValue, rate, years - 1);
    }

    // Optimized version using iteration (optional)
    public static double futureValueIterative(double currentValue, double rate, int years) {
        for (int i = 0; i < years; i++) {
            currentValue *= (1 + rate);
        }
        return currentValue;
    }
}

