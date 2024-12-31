package org.ParkingLotWithDesign.Strategy;

public class ParkingGooglePaymentStrategy implements ParkingPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Payment using google pay");
    }
}
