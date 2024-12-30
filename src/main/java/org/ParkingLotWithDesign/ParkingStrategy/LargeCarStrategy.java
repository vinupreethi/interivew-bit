package org.ParkingLotWithDesign.ParkingStrategy;

import org.ParkingLotWithDesign.Factory.Car;
import org.ParkingLotWithDesign.constants.ParkingSpotSize;
import org.ParkingLotWithDesign.model.Customer;
import org.ParkingLotWithDesign.model.ParkingSpot;

import java.util.List;

public class LargeCarStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot selectSpot(Customer customer, List<ParkingSpot> availableParkingSpots) {
        for (ParkingSpot parkingSpot : availableParkingSpots) {
            if (parkingSpot.getParkingSpotSize() == ParkingSpotSize.LARGE && customer.getVehicle() instanceof Car) {
                return parkingSpot;
            }
        }
        return null;
    }
}
