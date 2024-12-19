package org.ParkingLot;

public class DebitCard implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;

    // Constructor to initialize the CreditCard object
    public DebitCard(String cardNumber, String cardHolderName, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
