package org.ParkingLotWithDesign.Strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Credit card payment is done ");
    }
}
