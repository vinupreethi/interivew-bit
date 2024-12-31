package org.UberSystemDesign.UberPaymentStrategy;

import org.ParkingLotWithDesign.Strategy.PaymentStrategy;

public class DebitCardPaymentStrategy implements PaymentStrategy {
    @Override
    public double pay(double amount) {
        System.out.println("Paid through debit card");
        return amount;
    }
}
