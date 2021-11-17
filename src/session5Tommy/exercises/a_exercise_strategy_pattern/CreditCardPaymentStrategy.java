package session5Tommy.exercises.a_exercise_strategy_pattern;

public class CreditCardPaymentStrategy implements PaymentStrategy{

    private CreditCard creditCard;

    public CreditCardPaymentStrategy(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public boolean pay(double quantity) {
       return this.creditCard.chargeToTheCreditCard(quantity);
    }
}
