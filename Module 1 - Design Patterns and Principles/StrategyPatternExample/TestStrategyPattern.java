package StrategyPatternExample;

public class TestStrategyPattern {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        context.setPaymentStrategy(new CreditCardPayment());
        context.payAmount(500.0);

        // Pay using PayPal
        context.setPaymentStrategy(new PayPalPayment());
        context.payAmount(750.0);
    }
}
