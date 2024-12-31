package org.UberSystemDesign.StateOfRide;


import org.UberSystemDesign.VehicleFactory.Vehicle;
import org.UberSystemDesign.model.Location;
import org.UberSystemDesign.model.Ride;
import org.UberSystemDesign.model.Rider;

public interface RideState {
    void requestedRide(RideContext ride, Location location, Rider rider, Location desination, Vehicle vehicle);
    void driverAssigned(RideContext ride,Ride bookedride);
    void ridingOngoing(RideContext ride1, Location location, Location destination, Rider rider,Ride ride);
    void completedRide(RideContext ride,Ride bookedride,Location location);
    void cancelledRide(RideContext ride,Ride cancellingride);
}
