package org.uber.services;


import org.uber.models.License;
import org.uber.models.Location;
import org.uber.models.Ride;
import org.uber.vehicle.Auto;
import org.uber.vehicle.Bike;
import org.uber.vehicle.Cab;
import org.uber.vehicle.Vehicle;

import java.util.Scanner;

public class Rider {
    private int riderId;
    private String phoneNo;
    private String name;
    private UberApp uberApp;
    private Driver driver;
    private Ride ride;
    private int otp;
    private License license;

    public Rider(String phoneNo, String name) {
        this.phoneNo = phoneNo;
        this.name = name;
    }

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public Ride getRide() {
        return ride;
    }

    public void setRide(Ride ride) {
        this.ride = ride;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Driver getDriver() {
        return driver;
    }

    public int getRiderId() {
        return riderId;
    }

    public void setRiderId(int riderId) {
        this.riderId = riderId;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }


    Vehicle bookRide(Location currentLocation, Location destination) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the vehicle");
        String vehicle = scanner.next();
        if (vehicle.equals("AUTO"))
            return new Auto();
        else if (vehicle.equals("BIKE"))
            return new Bike();
        else
            return new Cab();

    }


    public Location detectCurrentLocation() {
        Scanner scanner = new Scanner(System.in);
        double latitude = scanner.nextDouble();
        double longitude = scanner.nextDouble();
        Location location = new Location(latitude, longitude);
        return location;
    }



}
