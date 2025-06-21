package FinancialForecasting;

public class TestForecast {
    public static void main(String[] args) {
        double principal = 10000;
        double rate = 0.1;  // 10%
        int years = 3;

        double futureVal = ForecastCalculator.futureValue(principal, rate, years);

        System.out.println(" Forecasted future value (recursive): ₹" + futureVal);

        // Optional comparison with iterative version
        double iterativeVal = ForecastCalculator.futureValueIterative(principal, rate, years);
        System.out.println(" Forecasted future value (iterative): ₹" + iterativeVal);
    }
}

