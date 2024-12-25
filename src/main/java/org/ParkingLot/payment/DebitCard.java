package org.ParkingLot.payment;

public class DebitCard implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;

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