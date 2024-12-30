package org.ParkingLotWithDesign.Strategy;

public class PaymentSelector implements PaymentContext {
    PaymentStrategy paymentStrategy;

    public PaymentSelector(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    @Override
    public void payment(long amount) {
        paymentStrategy.pay(amount);
    }
}
