package session9Tommy.d_testing_exceptions;

import org.junit.jupiter.api.Test;
import session9Tommy.b_customexceptions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BankAccountTest {

    @Test
    void getBalance() {
        BankAccount bankAccount = new BankAccount(100);
        assertEquals(100,bankAccount.getBalance());
    }

    @Test
    void withdraw() {
        BankAccount bankAccount = new BankAccount(100);
        bankAccount.withdraw(10);
        assertEquals(90,bankAccount.getBalance());
    }

    @Test
    void withdrawNegativeWithDrawException() {
        BankAccount bankAccount = new BankAccount(100);
        assertThrows(NegativeAmountException.class,()->{bankAccount.withdraw(-10);});
        assertEquals(100, bankAccount.getBalance());
    }

    @Test
    void withdrawInsufficientFundsException() {
        BankAccount bankAccount = new BankAccount(100);
        InsufficientFundsException fundsException = assertThrows(InsufficientFundsException.class,()->{bankAccount.withdraw(1000);});
        assertEquals(900,fundsException.getDeficit());
        assertEquals(100, bankAccount.getBalance());
    }

    @Test
    void depositNegativeDepositException(){
        BankAccount bankAccount = new BankAccount(100);
        assertThrows(NegativeDepositException.class, ()-> {bankAccount.deposit(-10);});
        assertEquals(100, bankAccount.getBalance());
    }

    @Test
    void depositWarningLargeDepositException(){
        BankAccount bankAccount = new BankAccount(100);
        WarningLargeDepositException exception = assertThrows(WarningLargeDepositException.class, ()->{bankAccount.deposit(200000);});
        assertEquals(200100, bankAccount.getBalance());

    }

    /**
     * Exercise:
     *
     * Write tests for deposit method:
     *  - Test that deposit method works well in standard conditions.
     *  - Test that deposit method throws the corresponding exception if a negative quantity is being deposited.
     *  - Test that deposit method throws the corresponding exception if a too large quantity is being deposited.
     */

    
}