package org.ParkingLotWithDesign.Strategy;

public class ParkingDebitCardPaymentStrategy implements ParkingPaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Debit card payment is done ");
    }
}
