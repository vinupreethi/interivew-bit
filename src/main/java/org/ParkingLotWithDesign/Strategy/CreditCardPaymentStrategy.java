package org.ParkingLotWithDesign.Strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay() {
        System.out.println("Credit card payment is done ");
    }
}
