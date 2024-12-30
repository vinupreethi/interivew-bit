package org.ParkingLotWithDesign.service;

import org.ParkingLotWithDesign.model.ParkingSpot;

public class AdminObserverImplementation implements AdminObserver{
    @Override
    public void notifyAvailableSpot(ParkingSpot parkingSpot) {
        System.out.println("Parking spot is available "+ parkingSpot.getParkingSpotNo());
    }
}
