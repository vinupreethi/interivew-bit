package org.ParkingLotWithDesign.Strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(long amount) {
        System.out.println("Credit card payment is done ");
    }
}
