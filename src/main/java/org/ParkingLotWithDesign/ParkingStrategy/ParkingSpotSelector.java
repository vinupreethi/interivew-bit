package org.ParkingLotWithDesign.ParkingStrategy;

import org.ParkingLotWithDesign.model.Customer;
import org.ParkingLotWithDesign.model.ParkingSpot;

import java.util.List;

public interface ParkingSpotSelector {
    ParkingSpot checkSpaceForVehicle(Customer customer, List<ParkingSpot> availableParkingSpots);
}
