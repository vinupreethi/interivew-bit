package org.ParkingLotWithDesign.Strategy;

public class DebitCardPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(long amount) {
        System.out.println("Debit card payment is done ");
    }
}
