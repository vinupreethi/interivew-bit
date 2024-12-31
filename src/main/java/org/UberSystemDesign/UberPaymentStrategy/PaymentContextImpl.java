package org.UberSystemDesign.UberPaymentStrategy;



public class PaymentContextImpl implements PaymentContext {

    UberPaymentStrategy paymentStrategy;

    public PaymentContextImpl(UberPaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }


    @Override
    public double completeThePayment(double amount) {
        return paymentStrategy.payment(amount);
    }
}
