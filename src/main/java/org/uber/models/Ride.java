package org.uber.models;

import org.uber.constants.RideStatus;
import org.uber.services.Driver;
import org.uber.services.Rider;
import org.uber.vehicle.Vehicle;

import java.util.Scanner;

public class Ride {
    private Driver driver;
    private Rider rider;
    private RideStatus rideStatus;
    private int otp;
    private Vehicle vehicle;
    private double distance;
    private Location location;
    private long startTime;
    private long endTime;

    public Ride(Rider rider, RideStatus rideStatus, String vehicle, int kilometer, Location currentLocation, long startTime, long endtime) {
        this.rider=rider;
        this.driver=driver;
        this.rideStatus=rideStatus;
        this.otp=otp;
        this.distance=distance;
        this.location=location;
        this.startTime=startTime;
        this.endTime=endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Ride(Rider rider, Driver driver, RideStatus rideStatus, int otp, Vehicle vehicle, double distance, Location location, long startTime, long endTime) {
        this.rider=rider;
        this.driver=driver;
        this.rideStatus=rideStatus;
        this.otp=otp;
        this.vehicle=vehicle;
        this.distance=distance;
        this.location=location;
        this.startTime=startTime;
        this.endTime=endTime;
    }


    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
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

    public RideStatus getRideStatus() {
        return rideStatus;
    }

    public void setRideStatus(RideStatus rideStatus) {
        this.rideStatus = rideStatus;
    }

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }

    public Location detectCurrentLocation() {
        Scanner scanner = new Scanner(System.in);
        double latitude = scanner.nextDouble();
        double longitude = scanner.nextDouble();
        Location location = new Location(latitude, longitude);
        return location;
    }



}
