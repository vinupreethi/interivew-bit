package org.ParkingLotWithDesign.service;

import org.ParkingLotWithDesign.model.ParkingSpot;

public interface AdminSubject {
    void doRegisterObserver(AdminObserver adminObserver);
    void doRemoveObserver(AdminObserver adminObserver);
    void doNotifyObserver(ParkingSpot parkingSpot);
}
