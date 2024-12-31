package org.UberSystemDesign.StateOfRide;


import org.UberSystemDesign.VehicleFactory.*;
import org.UberSystemDesign.constants.RideStatus;
import org.UberSystemDesign.model.Driver;
import org.UberSystemDesign.model.Location;
import org.UberSystemDesign.model.Ride;
import org.UberSystemDesign.model.Rider;
import org.UberSystemDesign.service.UberApp;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class RequestedRide implements RideState {
    private UberApp uberApp;

    @Override
    public void requestedRide(RideContext ride, Location currentLocation, Rider rider, Location desination, Vehicle vehicle) {

        Map<String, List<Driver>> citydriverList = uberApp.getCitydriverList();
        List<Driver> driverList = citydriverList.get(currentLocation.getCity());
        Driver driverAssigned = new Driver();
        double mindistance = Double.MAX_VALUE;
        for (Driver driver : driverList) {
            double distance = calculateDistance(currentLocation, driver.getLocation());
            if (distance > mindistance) {
                mindistance = distance;
                driverAssigned = driver;
            }
        }
        int random = new Random().nextInt(1000) + 9999;
        VehicleFactory vehicleFactory;
        double amount = 0;
        if (vehicle instanceof Bike) {
            vehicleFactory = new BikeFactory();
            Vehicle vehicle1 = vehicleFactory.createVehicle();
            amount = vehicle1.payment(mindistance);

        } else if (vehicle instanceof Cab) {
            vehicleFactory = new CabFactory();
            vehicleFactory.createVehicle();
            Vehicle vehicle1 = vehicleFactory.createVehicle();
            amount = vehicle1.payment(mindistance);
        } else if (vehicle instanceof Auto) {
            vehicleFactory = new AutoFactory();
            vehicleFactory.createVehicle();
            Vehicle vehicle1 = vehicleFactory.createVehicle();
            amount = vehicle1.payment(mindistance);
        }

        Ride bookedRide = new Ride(driverAssigned, rider, random, RideStatus.BOOKED, System.currentTimeMillis() / 60000, System.currentTimeMillis() / 60000 + 20, currentLocation, desination, amount);
        RideContext rideContext = new RideContext(new AssignedDriver());
        Driver driver = bookedRide.getDriver();
        uberApp.notifyObserver(driver, bookedRide);
        uberApp.notifyObserver(rider, bookedRide);
    }

    @Override
    public void driverAssigned(RideContext ride, Ride bookedride) {
        System.out.println("Rider requested for ride");
    }

    @Override
    public void ridingOngoing(RideContext ride1, Location location, Location destination, Rider rider, Ride ride) {
        System.out.println("Rider has not going on ride");
    }

    @Override
    public void completedRide(RideContext ride, Ride bookedRide, Location location) {
        System.out.println("Rider is not in any ride for now");
    }


    @Override
    public void cancelledRide(RideContext ride, Ride cancelledRide) {
        System.out.println("rider didnt cancel any ride for now");
    }

    private double calculateDistance(Location currentLocation, Location driverLocation) {
        double longitude1 = currentLocation.getLongitude();
        double longitude2 = currentLocation.getLongitude();
        double latitude1 = driverLocation.getLatitude();
        double latitude2 = driverLocation.getLatitude();
        return Math.sqrt(Math.pow(longitude2, 2) - Math.pow(longitude1, 2)) +
                Math.sqrt(Math.pow(latitude1, 2) - Math.pow(latitude2, 2));

    }
}
