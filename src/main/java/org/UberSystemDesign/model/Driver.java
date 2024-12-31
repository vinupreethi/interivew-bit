package org.UberSystemDesign.model;

import org.UberSystemDesign.constants.RideStatus;
import org.UberSystemDesign.observer.Observer;

public class Driver implements Observer {
    private String username;
    private String phoneNo;
    private String licenseNo;
    private Location location;
    private String password;
    private RideStatus rideStatus;
    private String city;

    public Driver(String username, String phoneNo, String licenseNo, Location location, String password, RideStatus rideStatus,String city) {
        this.username = username;
        this.phoneNo = phoneNo;
        this.licenseNo = licenseNo;
        this.location = location;
        this.password = password;
        this.rideStatus = rideStatus;
        this.city=city;
    }

    public Driver() {

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public RideStatus getRideStatus() {
        return rideStatus;
    }

    public void setRideStatus(RideStatus rideStatus) {
        this.rideStatus = rideStatus;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void update(Ride ride) {
        System.out.println("Ride has been "+ride.getRideStatus());
    }
}
