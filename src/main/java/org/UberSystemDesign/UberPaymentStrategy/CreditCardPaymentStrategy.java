package org.UberSystemDesign.UberPaymentStrategy;

public class CreditCardPaymentStrategy implements UberPaymentStrategy{
    @Override
    public double payment(double amount) {
        System.out.println("Paid through credit card");
        return amount;
    }
}
