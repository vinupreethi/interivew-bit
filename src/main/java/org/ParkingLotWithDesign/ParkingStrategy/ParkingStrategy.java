package org.ParkingLotWithDesign.ParkingStrategy;

import org.ParkingLotWithDesign.model.Customer;
import org.ParkingLotWithDesign.model.ParkingSpot;

import java.util.List;

public interface ParkingStrategy {
    ParkingSpot selectSpot(Customer customer, List<ParkingSpot> availableParkingSpots);
}
