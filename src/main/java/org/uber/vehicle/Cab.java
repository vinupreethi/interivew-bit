package org.uber.vehicle;

import org.uber.constants.RideStatus;
import org.uber.services.Driver;

public class Cab implements Vehicle {
    private static final double FARE = 40;
    private double distance;
    private RideStatus rideStatus;
    private Driver driver;
    public Cab() {

    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public double cost(double distance) {
        return distance * FARE;
    }
    @Override
    public void setRideStatus(RideStatus rideStatus) {
        this.rideStatus=rideStatus;;
    }

    @Override
    public RideStatus getRideStatus() {
        return rideStatus;
    }

    @Override
    public Driver getDriver() {
        return driver;
    }

    @Override
    public void setDriver(Driver driver) {
        this.driver=driver;
    }

}
