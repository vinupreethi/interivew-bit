package org.ParkingLotWithDesign.service;

public class ParkingLotisFullException extends Throwable {
    public ParkingLotisFullException(String parkingLotIsFull) {
        System.out.println("Parking lot is full");
    }
}
