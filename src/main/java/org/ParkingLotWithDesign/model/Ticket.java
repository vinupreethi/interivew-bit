package org.ParkingLotWithDesign.model;

import org.ParkingLotWithDesign.Factory.Vehicle;
import org.ParkingLotWithDesign.ParkingStrategy.ParkingSpotSelector;

public class Ticket {
    private int TicketId;
    private Customer customer;
    private Vehicle vehicle;
    private Long inTime;
    private ParkingSpot parkingSpot;

    public void setInTime(Long inTime) {
        this.inTime = inTime;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public long getInTime() {
        return inTime;
    }

    public void setInTime(long inTime) {
        this.inTime = inTime;
    }

    public int getTicketId() {
        return TicketId;
    }

    public void setTicketId(int ticketId) {
        TicketId = ticketId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
