package org.uber;

public class RiderObserver implements Observer {
    Driver driver;
    Ride ride;

    public RiderObserver(Driver driver, Ride ride) {
        this.driver = driver;
        this.ride = ride;
    }

    @Override
    public void update(Driver driver, Ride ride) {
        if (ride.getRideStatus() == RideStatus.ACCEPTED) {
            System.out.println("Driver accepted the ride will be reaching in few minutes....!");

        }
    }




}
