package org.designpatterns.BehaviouralDesignPattern.Strategy;



public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void payment() {
        System.out.println("PaymentStrategy.java using credit card");
    }
}
