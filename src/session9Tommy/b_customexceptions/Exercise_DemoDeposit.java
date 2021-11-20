package session9Tommy.b_customexceptions;

import session9Tommy.a_bankaccount.BankAccount;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *  - Introduce changes in the deposit method of the BankAccount to avoid that a negative
 *    quantity can be deposited using a custom exception "NegativeDepositException".
 *
 *  - Introduce a custom exception "WarningLargeDeposit" to give a warning to the user when s/he is depositing
 *    more than 100_000 DKK, stating that s/he must justify the origin of the money to SKAT.
 */
public class Exercise_DemoDeposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BankAccount account = new BankAccount(100);

        while (true) {
            System.out.println("Current Account Balance: "+account.getBalance());

            System.out.println("Enter an amount to deposit:");

            try {
                int amount = scanner.nextInt();
                account.deposit(amount);
            } catch (NegativeDepositException e) {
                System.out.println("Something went wrong: " + e.getMessage());
            } catch (WarningLargeDepositException e){
                System.out.println("warning - deposit: " + e.getMessage() + e.getLargeDepositAmount());
            }
        }
    }
}
