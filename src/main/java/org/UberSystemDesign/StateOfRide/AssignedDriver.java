package org.UberSystemDesign.StateOfRide;


import org.UberSystemDesign.VehicleFactory.Vehicle;
import org.UberSystemDesign.constants.RideStatus;
import org.UberSystemDesign.model.Driver;
import org.UberSystemDesign.model.Location;
import org.UberSystemDesign.model.Ride;
import org.UberSystemDesign.model.Rider;
import org.UberSystemDesign.service.UberApp;

public class AssignedDriver implements RideState {
    UberApp uberApp;

    @Override
    public void requestedRide(RideContext ride, Location location, Rider rider, Location desination, Vehicle vehicle) {
        System.out.println("Ride already requested. Driver being assigned");
    }

    @Override
    public void driverAssigned(RideContext ride, Ride bookedRide) {
        if (bookedRide.getRideStatus().equals(RideStatus.BOOKED)) {
            bookedRide.setRideStatus(RideStatus.CONFIRMED);
            Rider rider = bookedRide.getRider();
            rider.update(bookedRide);
            Driver driver = bookedRide.getDriver();
            driver.update(bookedRide);
            uberApp.notifyObserver(rider, bookedRide);
            uberApp.notifyObserver(driver, bookedRide);
            int otp = uberApp.generateOtp();
            rider.setOtp(otp);

        } else if (ride.getRideState().equals(RideStatus.CANCELLED)) {
            bookedRide.setRideStatus(RideStatus.CANCELLED);
            Rider rider = bookedRide.getRider();
            Driver driver = bookedRide.getDriver();
            uberApp.notifyObserver(driver, bookedRide);
            uberApp.notifyObserver(rider, bookedRide);

        }
    }

    @Override
    public void ridingOngoing(RideContext ride1, Location location, Location destination, Rider rider, Ride ride) {
        System.out.println("Driver assigned. Transitioning to In Progress state.");
    }

    @Override
    public void completedRide(RideContext ride, Ride bookedRide, Location location) {
        System.out.println("Completed. Transitioning to Completed state.");
    }

    @Override
    public void cancelledRide(RideContext ride, Ride cancelledRide) {
        System.out.println("Cancelled. Transitioning to Cancellege state.");

    }
}
