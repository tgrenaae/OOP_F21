package session9Tommy.b_customexceptions;

public class WarningLargeDepositException extends RuntimeException{
    int largeDepositAmount;

    public WarningLargeDepositException(String msg, int largeDepositAmount) {
        this.largeDepositAmount = largeDepositAmount;
    }

    public int getLargeDepositAmount() {
        return largeDepositAmount;
    }

}
