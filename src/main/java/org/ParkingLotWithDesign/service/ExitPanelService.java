package org.ParkingLotWithDesign.service;

import org.ParkingLotWithDesign.Factory.Car;
import org.ParkingLotWithDesign.FeeStrategy.BikeParkingFeeStrategy;
import org.ParkingLotWithDesign.FeeStrategy.CarParkingFeeStrategy;
import org.ParkingLotWithDesign.FeeStrategy.ParkingFeeStrategy;
import org.ParkingLotWithDesign.FeeStrategy.VehicleFeeSelector;
import org.ParkingLotWithDesign.Strategy.GooglePaymentStrategy;
import org.ParkingLotWithDesign.Strategy.PaymentContext;
import org.ParkingLotWithDesign.Strategy.PaymentSelector;
import org.ParkingLotWithDesign.Strategy.PaymentStrategy;
import org.ParkingLotWithDesign.constants.ParkingSpotStatus;
import org.ParkingLotWithDesign.model.Ticket;

public class ExitPanelService {


    private long outTime;
    private Ticket ticket;


    public void calculateCost() {
        if (ticket.getVehicle() instanceof Car) {
            ParkingFeeStrategy parkingFeeStrategy = new CarParkingFeeStrategy();
            VehicleFeeSelector vehicleFeeSelector = new VehicleFeeSelector(parkingFeeStrategy);
            long amount = vehicleFeeSelector.payVehicleFee(ticket, System.currentTimeMillis());
            PaymentStrategy paymentStrategy = new GooglePaymentStrategy();
            PaymentContext paymentContext = new PaymentSelector(paymentStrategy);
            paymentContext.payment(amount);
        } else {
            ParkingFeeStrategy parkingFeeStrategy = new BikeParkingFeeStrategy();
            VehicleFeeSelector vehicleFeeSelector = new VehicleFeeSelector(parkingFeeStrategy);
            long amount = vehicleFeeSelector.payVehicleFee(ticket, System.currentTimeMillis());
            PaymentStrategy paymentStrategy = new GooglePaymentStrategy();
            PaymentContext paymentContext = new PaymentSelector(paymentStrategy);
            paymentContext.payment(amount);
        }
        ticket.getParkingSpot().setParkingStatus(ParkingSpotStatus.AVAILABLE);

    }

}
