package session9Tommy.b_customexceptions;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            throw new NegativeAmountException();
        }
        if (amount >= balance) {
            int deficit = amount - balance;
            throw new InsufficientFundsException(deficit);
        }

        balance = balance - amount;

        if(amount > 100000){
            int largerThanLimit = amount - 100000;
            String msg = "You need to justify the amount to SKAT!";
            throw new WarningLargeDepositException(msg, largerThanLimit);
        }
    }

    public void deposit(int amount) {
        if(amount < 0){
            throw new NegativeDepositException();
        }

        balance = balance + amount;

        if(amount > 100000){
            int largerThanLimit = amount - 100000;
            String msg = "You need to justify the amount to SKAT!";
            throw new WarningLargeDepositException(msg, largerThanLimit);
        }
    }
}