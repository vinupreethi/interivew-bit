package org.ParkingLotWithDesign.ParkingStrategy;

import org.ParkingLotWithDesign.Factory.Bike;
import org.ParkingLotWithDesign.constants.ParkingSpotSize;
import org.ParkingLotWithDesign.model.Customer;
import org.ParkingLotWithDesign.model.ParkingSpot;

import java.util.List;

public class HandicappedBikeStrategy  implements ParkingStrategy{
    @Override
    public ParkingSpot selectSpot(Customer customer, List<ParkingSpot> availableParkingSpots) {
        for (ParkingSpot parkingSpot : availableParkingSpots) {
            if (parkingSpot.getParkingSpotSize() == ParkingSpotSize.HANDICAPPED && customer.getVehicle() instanceof Bike) {
                return parkingSpot;
            }
        }
        return null;
    }
}
