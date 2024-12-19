package org.ParkingLot;

public class ParkingSpot {
    int number;
    SpotSize spotSize;
    Vehicle vehicle;
    VehicleTicket ticket;
    ParkingStatus parkingStatus;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public SpotSize getSpotSize() {
        return spotSize;
    }

    public void setSpotSize(SpotSize spotSize) {
        this.spotSize = spotSize;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleTicket getTicket() {
        return ticket;
    }

    public void setTicket(VehicleTicket ticket) {
        this.ticket = ticket;
    }

    public ParkingStatus getParkingStatus() {
        return parkingStatus;
    }

    public void setParkingStatus(ParkingStatus parkingStatus) {
        this.parkingStatus = parkingStatus;
    }
}
