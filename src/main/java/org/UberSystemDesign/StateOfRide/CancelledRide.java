package org.UberSystemDesign.StateOfRide;


import org.UberSystemDesign.VehicleFactory.Vehicle;
import org.UberSystemDesign.constants.RideStatus;
import org.UberSystemDesign.model.Driver;
import org.UberSystemDesign.model.Location;
import org.UberSystemDesign.model.Ride;
import org.UberSystemDesign.model.Rider;
import org.UberSystemDesign.service.UberApp;

public class CancelledRide implements RideState{
    UberApp uberApp;
    @Override
    public void requestedRide(RideContext ride, Location location, Rider rider, Location desination, Vehicle vehicle) {
        System.out.println("Already request ride");
    }

    @Override
    public void driverAssigned(RideContext ride,Ride bookedride) {
        System.out.println("Driver has been assigned, Ride needs to be cancelled");
    }

    @Override
    public void ridingOngoing(RideContext ride1, Location location, Location destination, Rider rider,Ride ride) {
        System.out.println("Ride is not ongoing, Ride needs to be cancelled");
    }

    @Override
    public void completedRide(RideContext ride,Ride bookedRide,Location location) {
        System.out.println("Ride is cancelled");
    }

    @Override
    public void cancelledRide(RideContext ride,Ride rideNeedstoBeCancelled) {
        rideNeedstoBeCancelled.setRideStatus(RideStatus.CANCELLED);
        Rider rider = rideNeedstoBeCancelled.getRider();
        Driver driver = rideNeedstoBeCancelled.getDriver();
        uberApp.notifyObserver(driver,rideNeedstoBeCancelled);
        uberApp.notifyObserver(rider,rideNeedstoBeCancelled);
    }
}
