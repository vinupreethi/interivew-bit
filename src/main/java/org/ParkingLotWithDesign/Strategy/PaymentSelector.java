package org.ParkingLotWithDesign.Strategy;

public class PaymentSelector implements PaymentContext {
    ParkingPaymentStrategy paymentStrategy;

    public PaymentSelector( ParkingPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    @Override
    public void payment(long amount) {
        paymentStrategy.pay(amount);
    }
}
