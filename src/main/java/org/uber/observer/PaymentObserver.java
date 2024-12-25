package org.uber.observer;

import org.uber.*;
import org.uber.constants.RideStatus;
import org.uber.models.Ride;
import org.uber.payment.CreditCardPayment;
import org.uber.payment.DebitCardPayment;
import org.uber.payment.Payment;
import org.uber.payment.UpiPayment;
import org.uber.services.Driver;

import java.util.Scanner;

public class PaymentObserver implements Observer {
    Driver driver;
    Ride ride;
    Payment payment;

    public PaymentObserver(Driver driver, Ride ride) {
        this.driver = driver;
        this.ride = ride;
    }

    @Override
    public void update(Driver driver, Ride ride) {
        if (ride.getRideStatus().equals(RideStatus.COMPLETED)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose the Payment Mode");
            String paymentMode = scanner.next();
            if (paymentMode.equals("CREDIT CARD")) {
                payment = new CreditCardPayment("5211-2314-1234-1212", "Vinothini", "01/11/2027");
                payment.pay(ride.getVehicle().cost(ride.getDistance()));
            } else if (paymentMode.equals("DEBIT CARD")) {
                payment = new DebitCardPayment("5211-2314-1234-1212", "Vinothini", "01/11/2027");
                payment.pay(ride.getVehicle().cost(ride.getDistance()));
            } else if (paymentMode.equals("UPI")) {
                payment = new UpiPayment("vinupreethi123@icici");
                payment.pay(ride.getVehicle().cost(ride.getDistance()));
            } else
                System.out.println("Cash on Delivery");

        }

    }


}
