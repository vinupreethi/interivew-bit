/*
package org.ParkingLotSystem.service;

import org.ParkingLotSystem.constants.ParkingStatus;
import org.ParkingLotSystem.model.ParkingSpotStatus;
import org.ParkingLotSystem.payment.CreditCard;
import org.ParkingLotSystem.payment.DebitCard;
import org.ParkingLotSystem.payment.PaymentStrategy;
import org.ParkingLotSystem.payment.UPIPayment;

import java.util.Scanner;

public class CustomerService {
    PaymentStrategy paymentStrategy;
    public void payFare(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the PaymentStrategy.java Mode");
        String payment = scanner.next();
        if (payment.equals("CREDIT CARD")) {
            paymentStrategy = new CreditCard("5211-2314-1234-1212", "Vinothini", "01/11/2027");
        } else if (payment.equals("DEBIT CARD")) {
            paymentStrategy = new DebitCard("5211-2314-1234-1212", "Vinothini", "01/11/2027");

        } else if (payment.equals("UPI")) {
            paymentStrategy = new UPIPayment("vinupreethi123@icici");
        }
        paymentStrategy.pay(amount);
    }


    public void parkVehicle(ParkingSpotStatus vacantparkingSpot) {
        vacantparkingSpot.setParkingStatus(ParkingStatus.OCCUPIED);
    }
}
*/
