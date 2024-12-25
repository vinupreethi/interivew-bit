package org.uber.vehicle;

import org.uber.constants.RideStatus;
import org.uber.services.Driver;

public interface Vehicle {

    double cost(double distance);

    void setRideStatus(RideStatus rideStatus);

    RideStatus getRideStatus();

    Driver getDriver();

    void setDriver(Driver driver);
}
