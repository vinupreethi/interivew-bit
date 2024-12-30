package org.ParkingLotWithDesign.Strategy;

public class GooglePaymentStrategy implements PaymentStrategy {
    @Override
    public void pay() {
        System.out.println("Payment using google pay");
    }
}
