package org.uber;

public class DebitCardPayment implements Payment{
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;

    public DebitCardPayment(String cardNumber, String cardHolderName, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
