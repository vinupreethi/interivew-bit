package org.UberSystemDesign.model;

import org.UberSystemDesign.UberPaymentStrategy.PaymentContext;
import org.UberSystemDesign.UberPaymentStrategy.PaymentContextImpl;
import org.UberSystemDesign.constants.RideStatus;
import org.UberSystemDesign.observer.Observer;
import org.UberSystemDesign.service.UberApp;

import java.util.Random;

public class Rider implements Observer {

    private String username;
    private String phoneNo;
    private Location location;
    private String password;
    private UberApp uberApp;
    private int otp;

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
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
        System.out.println("Ride has been " + ride.getRideStatus());


    }


}
