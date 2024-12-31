package org.UberSystemDesign.StateOfRide;


import org.ParkingLotWithDesign.Strategy.GooglePaymentStrategy;
import org.ParkingLotWithDesign.Strategy.PaymentStrategy;
import org.UberSystemDesign.UberPaymentStrategy.PaymentContext;
import org.UberSystemDesign.UberPaymentStrategy.PaymentContextImpl;
import org.UberSystemDesign.VehicleFactory.Vehicle;
import org.UberSystemDesign.model.Driver;
import org.UberSystemDesign.model.Location;
import org.UberSystemDesign.model.Ride;
import org.UberSystemDesign.model.Rider;
import org.UberSystemDesign.service.UberApp;

public class CompletedRide implements RideState {
    UberApp uberApp;
    @Override
    public void requestedRide(RideContext ride, Location location, Rider rider, Location desination, Vehicle vehicle) {
        System.out.println("Already request ride");
    }

    @Override
    public void driverAssigned(RideContext ride,Ride bookedride) {
        System.out.println("Driver has been assigned");
    }

    @Override
    public void ridingOngoing(RideContext ride1, Location location, Location destination, Rider rider, Ride ride) {
        System.out.println("Ride is completed");
    }

    @Override
    public void completedRide(RideContext ride, Ride completedRide, Location location) {
        if (completedRide.getDesination() == location) {
            System.out.println("Ride has been completed..!");
        }
        Rider rider =completedRide.getRider();
        Driver driver = completedRide.getDriver();
        uberApp.notifyObserver(driver,completedRide);
        uberApp.notifyObserver(rider,completedRide);
        PaymentStrategy paymentStrategy = new GooglePaymentStrategy();
        PaymentContext paymentContext = new PaymentContextImpl(paymentStrategy);
        paymentContext.completeThePayment(completedRide.getEstimatedAmount());
    }

    @Override
    public void cancelledRide(RideContext ride,Ride cancelledRide){
        System.out.println("Ride has been completed now");
    }
}
