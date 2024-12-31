package org.UberSystemDesign.StateOfRide;


import org.UberSystemDesign.VehicleFactory.Vehicle;
import org.UberSystemDesign.model.Location;
import org.UberSystemDesign.model.Ride;
import org.UberSystemDesign.model.Rider;

public class RideContext {
    private RideState rideState;
    private Ride bookedRide;

    public RideContext(RideState rideState) {
        this.rideState = rideState;
    }


    public RideState getRideState() {
        return rideState;
    }

    public void setRideState(RideState rideState) {
        this.rideState = rideState;
    }

    public void assignDriver(Ride ride) {
        rideState.driverAssigned(this,ride);
    }

    public void cancelRide(Ride ride) {
        rideState.cancelledRide(this,ride);
    }


    public void requestRide(Location location, Rider rider, Location desination, Vehicle vehicle) {
        rideState.requestedRide(this, location, rider, desination, vehicle);
    }

    public void ongoingRide(Location location, Location destination, Rider rider) {
        rideState.ridingOngoing(this, location, destination, rider, bookedRide);
    }


}
