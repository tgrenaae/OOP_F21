package session9Tommy.a_bankaccount;

import session9Tommy.b_customexceptions.WarningLargeDepositException;

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
            String msg = "Amount must be positive.";
            throw new IllegalArgumentException(msg);
        }
        if (amount >= balance) {
            String msg = "Amount must be less than balance.";
            throw new IllegalArgumentException(msg);
        }
        balance = balance - amount;
    }

    public void deposit(int amount) {
        if(amount < 0){
            String msg = "Amount must be positive.";
            throw new IllegalArgumentException(msg);
        }

        balance = balance + amount;

        if(amount > 100000){
            int largerThanLimit = amount - 100000;
            String msg = "You need to justify the amount to SKAT!";
            throw new WarningLargeDepositException(msg, largerThanLimit);
        }
    }
}