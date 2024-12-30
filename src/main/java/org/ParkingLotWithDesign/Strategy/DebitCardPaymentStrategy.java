package org.ParkingLotWithDesign.Strategy;

public class DebitCardPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Debit card payment is done ");
    }
}
