package org.UberSystemDesign.UberPaymentStrategy;

import org.ParkingLotWithDesign.Strategy.PaymentStrategy;

public class PaymentContextImpl implements PaymentContext {

    PaymentStrategy paymentStrategy;

    public PaymentContextImpl(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }


    @Override
    public double completeThePayment(double amount) {
        return paymentStrategy.pay(amount);
    }
}
