package org.UberSystemDesign.UberPaymentStrategy;



public class DebitCardPaymentStrategy implements UberPaymentStrategy{


    @Override
    public double payment(double amount) {
        System.out.println("Paid through debit card");
        return amount;
    }
}
