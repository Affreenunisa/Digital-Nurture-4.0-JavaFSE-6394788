package AdapterPatternExample;

public class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPal;

    public PayPalAdapter(PayPalGateway payPal) {
        this.payPal = payPal;
    }

    public void processPayment(double amount) {
        payPal.makePayment(amount);
    }
}