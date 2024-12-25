package org.uber.observer;

import java.util.Scanner;

public class DriverObserver implements Observer {
    Driver driver;
    Ride ride;

    public DriverObserver(Driver driver, Ride ride) {
        this.driver = driver;
        this.ride = ride;
    }

    @Override
    public void update(Driver driver, Ride ride) {
        if (ride.getRideStatus().equals(RideStatus.BOOKED)) {
            System.out.println("Accept/ Deny the ride");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if (input.equals("ACCEPT"))
                ride.setRideStatus(RideStatus.ACCEPTED);
            else
                ride.setRideStatus(RideStatus.DENIED);
        } else if (ride.getRideStatus().equals(RideStatus.COMPLETED)) {
            driver.setRideStatus(RideStatus.AVAILABLE_FOR_NEW_RIDE);
        } else if (ride.getRideStatus().equals(RideStatus.CANCELLED)) {
            driver.setRideStatus(RideStatus.AVAILABLE_FOR_NEW_RIDE);
        }

    }



}


