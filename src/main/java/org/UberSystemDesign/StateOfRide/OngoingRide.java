package org.UberSystemDesign.StateOfRide;


import org.UberSystemDesign.VehicleFactory.Vehicle;
import org.UberSystemDesign.model.Location;
import org.UberSystemDesign.model.Ride;
import org.UberSystemDesign.model.Rider;

public class OngoingRide implements RideState{
    @Override
    public void requestedRide(RideContext ride, Location location, Rider rider, Location desination, Vehicle vehicle) {
        System.out.println("Already request ride");
    }

    @Override
    public void driverAssigned(RideContext ride,Ride bookedride) {
        System.out.println("Ride has been ongoing now");
    }

    @Override
    public void ridingOngoing(RideContext ride1, Location location, Location destination, Rider rider,Ride ride) {
        if (location != destination) {
            System.out.println("Ride is ongoing");
            Long currentime=System.currentTimeMillis()/60000;
            Long estimatedTime=ride.getEstimatedTime()/60000;
            System.out.println("Estimated time to reach the destination "+ (estimatedTime-currentime));
        }
    }

    @Override
    public void completedRide(RideContext ride,Ride bookedRide,Location location) {
        System.out.println("Ride has been ongoing now");
    }

    @Override
    public void cancelledRide(RideContext ride,Ride cancelledRide) {
        System.out.println("Ride has been ongoing now");
    }
}
