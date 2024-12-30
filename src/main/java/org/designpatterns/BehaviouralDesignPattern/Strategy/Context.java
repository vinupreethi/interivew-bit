package org.designpatterns.BehaviouralDesignPattern.Strategy;


/*
The Strategy pattern is a behavioral design pattern that allows an object to
change its behavior at runtime based on the algorithm or strategy it uses.
This pattern defines a family of algorithms, encapsulates each one, and
 makes them interchangeable. The strategy allows a client to choose which algorithm to use,
 offering more flexibility and maintainability in the code.

*/
public class Context {
    PaymentStrategy paymentStrategy;

   Context(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void setPaymentStrategy()
    {
        paymentStrategy.payment();
    }
}
