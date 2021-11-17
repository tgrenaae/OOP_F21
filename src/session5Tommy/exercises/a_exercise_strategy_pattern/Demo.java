package session5Tommy.exercises.a_exercise_strategy_pattern;

public class Demo {
    public static void main(String[] args) {

        Product iphone = new Product("Iphone", 10000);
        Product gloves = new Product("gloves", 500);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(iphone);
        shoppingCart.addProduct(gloves);


        CreditCard card = new CreditCard("Andres", 12345678, 123, 30_000);
        PaymentStrategy creditCardStrategy = new CreditCardPaymentStrategy(card);
        PayPal payPal = new PayPal("t@gmail.com",150000);
        PaymentStrategy payPalStrategy = new PayPalPaymentStrategy(payPal);
        if (shoppingCart.pay(payPalStrategy)){
            System.out.println("Successful Payment");
        }else{
            System.out.println("Wrong Payment");
        }
    }
}
