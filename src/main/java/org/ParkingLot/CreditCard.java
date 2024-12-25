package org.ParkingLot;

public class CreditCard implements PaymentStrategy{
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;

    public CreditCard(String cardNumber, String cardHolderName, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
