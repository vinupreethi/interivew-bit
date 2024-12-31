package org.UberSystemDesign.service;


import org.UberSystemDesign.StateOfRide.*;
import org.UberSystemDesign.VehicleFactory.Vehicle;
import org.UberSystemDesign.model.Driver;
import org.UberSystemDesign.model.Location;
import org.UberSystemDesign.model.Ride;
import org.UberSystemDesign.model.Rider;
import org.UberSystemDesign.observer.Observer;
import org.UberSystemDesign.observer.Subject;

import java.util.*;

public class UberApp implements Subject {

    Map<String, List<Driver>> citydriverList = new HashMap<>();
    List<Rider> riderList = new ArrayList<>();
    List<Ride> rideList = new ArrayList<>();
    List<Observer> observers=new ArrayList<>();
    public Map<String, List<Driver>> getCitydriverList() {
        return citydriverList;
    }

    public void setCitydriverList(Map<String, List<Driver>> citydriverList) {
        this.citydriverList = citydriverList;
    }

    public List<Rider> getRiderList() {
        return riderList;
    }

    public void setRiderList(List<Rider> riderList) {
        this.riderList = riderList;
    }

    public List<Ride> getRideList() {
        return rideList;
    }

    public void setRideList(List<Ride> rideList) {
        this.rideList = rideList;
    }

    public void bookRide(Rider rider, Location currentLocation, Location destination, Vehicle vehicle) {
        RideContext rideContext = new RideContext(new RequestedRide());
        rideContext.requestRide(currentLocation, rider, destination, vehicle);
    }

    public void cancelRide(Ride ride) {
        RideContext rideContext = new RideContext(new CancelledRide());
        rideContext.cancelRide(ride);
    }

    public void completeRide() {
        RideContext rideContext = new RideContext(new CompletedRide());
    }

    public void assignRide() {
        RideContext rideContext = new RideContext(new AssignedDriver());
    }

    public void onGoingRide() {
        RideContext rideContext = new RideContext(new OngoingRide());
    }


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(Observer observer,Ride ride) {
        observer.update(ride);
    }

    public int generateOtp() {
        int random = new Random().nextInt(1000) + 9999;
        return random;
    }
}
