package org.ParkingLotWithDesign.model;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {

    private int floorNo;
    List<ParkingSpot> parkingSpotList=new ArrayList<>();

    public ParkingFloor(int floorNo, List<ParkingSpot> parkingSpotList) {
        this.floorNo = floorNo;
        this.parkingSpotList = parkingSpotList;
    }

    public List<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }

    public void setParkingSpotList(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }
}
