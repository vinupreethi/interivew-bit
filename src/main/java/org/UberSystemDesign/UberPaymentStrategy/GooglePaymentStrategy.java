package org.UberSystemDesign.UberPaymentStrategy;

public class GooglePaymentStrategy implements UberPaymentStrategy{
    @Override
    public double payment(double amount) {
        System.out.println("Paid through google pay");
        return amount;
    }
}
