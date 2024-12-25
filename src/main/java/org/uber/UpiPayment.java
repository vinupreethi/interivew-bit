package org.uber;

public class UpiPayment implements Payment {
    private String upiId;

    public UpiPayment(String upiId) {
        this.upiId=upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}
