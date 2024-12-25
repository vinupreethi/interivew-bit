package org.Ecommerce.payments;


import java.util.Scanner;

public class DebitCardService implements PaymentService {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private Double balance;
    private Account account;

    // Constructor to initialize the CreditCard object
    public DebitCardService(String cardNumber, String cardHolderName, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(double amount) throws InSufficientBalanceException {
        System.out.println("Enter Sellername");
        Scanner scanner=new Scanner(System.in);
        String username=scanner.next();
        String password=scanner.next();
        account=new Account(username,password);
        if(account.checkBalance()) {
            account.withdrawAmount(amount);
        }
        else
        {
            throw new InSufficientBalanceException("Insufficient Balance");
        }
    }
}