package session4Tommy.vendingmachine;

public class PaymentMethod {
    private double balance;

    public PaymentMethod(double initialBalance){
        this.balance = initialBalance;
    }

    public boolean pay(double quantity){
        if (this.balance>quantity){
            this.balance-=quantity;
            return true;
        }else
            return false;
    }
}
