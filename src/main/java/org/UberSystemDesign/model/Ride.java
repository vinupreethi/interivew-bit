package org.UberSystemDesign.model;

import org.UberSystemDesign.constants.RideStatus;

public class Ride {
    private Driver driver;
    private Rider rider;
    private int id;
    private RideStatus rideStatus;
    private long currentTime;
    private long estimatedTime;
    private Location current;
    private Location desination;
    private double estimatedAmount;

    public double getEstimatedAmount() {
        return estimatedAmount;
    }

    public void setEstimatedAmount(double estimatedAmount) {
        this.estimatedAmount = estimatedAmount;
    }

    public Location getCurrent() {
        return current;
    }

    public void setCurrent(Location current) {
        this.current = current;
    }

    public Location getDesination() {
        return desination;
    }

    public void setDesination(Location desination) {
        this.desination = desination;
    }

    public long getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(long currentTime) {
        this.currentTime = currentTime;
    }

    public long getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(long estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public Ride(Driver driver, Rider rider, int id, RideStatus rideStatus, long currentTime, long estimatedTime, Location current,Location desination, double amount) {
        this.driver = driver;
        this.rider = rider;
        this.id = id;
        this.rideStatus = rideStatus;
        this.currentTime=currentTime;
        this.estimatedTime=estimatedTime;
        this.current=current;
        this.desination=desination;
        this.estimatedAmount=amount;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Rider getRider() {
        return rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RideStatus getRideStatus() {
        return rideStatus;
    }

    public void setRideStatus(RideStatus rideStatus) {
        this.rideStatus = rideStatus;
    }
}
