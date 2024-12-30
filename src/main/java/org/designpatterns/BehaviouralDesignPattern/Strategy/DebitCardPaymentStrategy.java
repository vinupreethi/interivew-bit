package org.designpatterns.BehaviouralDesignPattern.Strategy;

public class DebitCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void payment() {
        System.out.println("PaymentStrategy.java using debit card");
    }
}
