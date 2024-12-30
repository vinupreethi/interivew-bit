package org.ParkingLotWithDesign.ParkingStrategy;


import org.ParkingLotWithDesign.model.Customer;
import org.ParkingLotWithDesign.model.ParkingSpot;

import java.util.List;

public class ParkingSpotContext implements ParkingSpotSelector {

    ParkingStrategy parkingStrategy;

    ParkingSpotContext(ParkingStrategy parkingStrategy) {
        this.parkingStrategy = parkingStrategy;
    }

    @Override
    public ParkingSpot checkSpaceForVehicle(Customer customer, List<ParkingSpot> availableParkingSpots) {
        return parkingStrategy.selectSpot(customer, availableParkingSpots);
    }
}
