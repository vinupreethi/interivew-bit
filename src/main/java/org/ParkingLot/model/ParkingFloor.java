package org.ParkingLot.model;

import java.util.List;

public class ParkingFloor {
    List<ParkingSpot> parkingSpotList;

    public List<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }

    public void setParkingSpotList(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }
}
