package org.designpatterns.BehaviouralDesignPattern.Strategy;

public class Example {
    public static void main(String args[])
    {
       PaymentStrategy strategy=new DebitCardPaymentStrategy();
       strategy.payment();


    }
}
