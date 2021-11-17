package session5Tommy.exercises.a_exercise_strategy_pattern;

public class PayPalPaymentStrategy implements PaymentStrategy{

    private PayPal payPal;

    public PayPalPaymentStrategy(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public boolean pay(double quantity) {
        return this.payPal.processPayment(quantity);
    }
}
