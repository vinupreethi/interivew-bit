package org.ParkingLotWithDesign.model;

import org.ParkingLotWithDesign.Factory.Vehicle;
import org.ParkingLotWithDesign.constants.ParkingSpotSize;
import org.ParkingLotWithDesign.constants.ParkingSpotStatus;

public class ParkingSpot {
    private int parkingSpotNo;
    private ParkingSpotSize parkingSpotSize;
    private Vehicle vehicle;
    private ParkingSpotStatus parkingStatus;

    public ParkingSpot(int parkingSpotNo, ParkingSpotSize parkingSpotSize, ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotNo=parkingSpotNo;
        this.parkingSpotSize=parkingSpotSize;
        this.parkingStatus=parkingSpotStatus;
    }

    public int getParkingSpotNo() {
        return parkingSpotNo;
    }

    public void setParkingSpotNo(int parkingSpotNo) {
        this.parkingSpotNo = parkingSpotNo;
    }

    public ParkingSpotSize getParkingSpotSize() {
        return parkingSpotSize;
    }

    public void setParkingSpotSize(ParkingSpotSize parkingSpotSize) {
        this.parkingSpotSize = parkingSpotSize;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpotStatus getParkingStatus() {
        return parkingStatus;
    }

    public void setParkingStatus(ParkingSpotStatus parkingStatus) {
        this.parkingStatus = parkingStatus;
    }
}
