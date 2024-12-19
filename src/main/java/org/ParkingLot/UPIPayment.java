package org.ParkingLot;

public class UPIPayment implements PaymentStrategy {
    private String upiId;

    // Constructor to initialize the CreditCard object
    public UPIPayment(String upiId) {
       this.upiId=upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
