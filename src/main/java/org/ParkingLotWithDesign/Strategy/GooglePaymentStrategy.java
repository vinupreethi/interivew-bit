package org.ParkingLotWithDesign.Strategy;

public class GooglePaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Payment using google pay");
    }
}
