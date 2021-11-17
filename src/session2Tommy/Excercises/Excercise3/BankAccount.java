package session2Tommy.Excercises.Excercise3;

public class BankAccount {
    float balance;
    float borrowRate;
    float savingsRate;

    public void depositMoney(int deposit){
        this.balance += deposit;
    }

    public void withdrawMoney(int withdraw){
        if(this.balance >= withdraw){
            this.balance = (this.balance - withdraw);
        }
    }

    public void chargeInterest(){
        this.balance = this.balance * (1 - borrowRate);
    }

    public void accrueInterest(){
        this.balance = this.balance * (1 + savingsRate);
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getBorrowRate() {
        return borrowRate;
    }

    public void setBorrowRate(float borrowRate) {
        this.borrowRate = borrowRate;
    }

    public float getSavingsRate() {
        return savingsRate;
    }

    public void setSavingsRate(float savingsRate) {
        this.savingsRate = savingsRate;
    }
}
