package org.ParkingLotWithDesign.service;

import org.ParkingLotWithDesign.model.ParkingSpot;

interface AdminObserver {
    void notifyAvailableSpot(ParkingSpot parkingSpot);
}
