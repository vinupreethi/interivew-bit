package org.uber;

public interface Vehicle {

    double cost(double distance);

    void setRideStatus(RideStatus rideStatus);

    RideStatus getRideStatus();

    Driver getDriver();

    void setDriver(Driver driver);
}
