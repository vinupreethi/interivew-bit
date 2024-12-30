package org.ParkingLotWithDesign.model;

import org.ParkingLotWithDesign.Factory.Vehicle;
import org.ParkingLotWithDesign.ParkingStrategy.ParkingStrategy;

public class Customer {
    private String username;
    private String password;
    private String phoneNumber;
    private Vehicle vehicle;
    private String vehicleName;
    private ParkingStrategy parkingStrategy;
    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }



    public ParkingStrategy getParkingStrategy() {
        return parkingStrategy;
    }
}
