package org.ParkingLotWithDesign.Strategy;

public class ParkingCreditCardPaymentStrategy implements ParkingPaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Credit card payment is done ");
    }
}
