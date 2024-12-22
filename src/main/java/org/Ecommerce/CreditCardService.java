package org.Ecommerce;

import java.util.Scanner;

public class CreditCardService implements PaymentService {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    Account account;

    public CreditCardService(String cardNumber, String cardHolderName, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(double amount) throws InSufficientBalanceException {
        System.out.println("Enter Sellername");
        Scanner scanner = new Scanner(System.in);
        String Sellername = scanner.next();
        String password = scanner.next();
        account = new Account(Sellername, password);
        if (account.checkBalance()) {
            account.withdrawAmount(amount);
        } else {
            throw new InSufficientBalanceException("Insufficient Balance");
        }
    }
}
