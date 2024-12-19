package org.ParkingLot;

import java.util.Scanner;

public class Customer {

    String name;
    Vehicle vehicle;
    PaymentStrategy paymentStrategy;

    Customer(String name, Vehicle vehicle)
    {
        this.name=name;
        this.vehicle=vehicle;

    }
    public void payFare(double amount) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Choose the Payment Mode");
        String payment=scanner.next();
        if(payment.equals("CREDIT CARD")) {
            paymentStrategy = new CreditCard("5211-2314-1234-1212","Vinothini","01/11/2027");
        }
        else if(payment.equals("DEBIT CARD"))
        {
            paymentStrategy = new DebitCard("5211-2314-1234-1212","Vinothini","01/11/2027");

        }
        else if(payment.equals("UPI"))
        {
            paymentStrategy=new UPIPayment("vinupreethi123@icici");
        }
        paymentStrategy.pay(amount);
    }


    public void parkVehicle( ParkingSpot vacantparkingSpot) {
        vacantparkingSpot.parkingStatus=ParkingStatus.OCCUPIED;
    }
}
