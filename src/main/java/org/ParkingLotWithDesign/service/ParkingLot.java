package org.ParkingLotWithDesign.service;


import org.ParkingLotWithDesign.constants.ParkingSpotSize;
import org.ParkingLotWithDesign.constants.ParkingSpotStatus;
import org.ParkingLotWithDesign.model.ParkingFloor;
import org.ParkingLotWithDesign.model.ParkingSpot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot implements AdminSubject {
    public static volatile ParkingLot parkinglot = null;
    private List<ParkingFloor> parkingFloors;
    private List<AdminObserver> adminObservers;
    private AdminObserver adminObserver;

    public static ParkingLot getParkinglot() {
        return parkinglot;
    }

    public static void setParkinglot(ParkingLot parkinglot) {
        ParkingLot.parkinglot = parkinglot;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }

    private ParkingLot() {
        parkingFloors = new ArrayList<>();
    }

    public static ParkingLot getInstance() {
        if (parkinglot == null) {
            synchronized (ParkingLot.class) {
                if (parkinglot == null)
                    return new ParkingLot();
            }
        }
        return parkinglot;
    }

    public void initializeParkingLot() {
        List<ParkingSpot> parkingSpotList = new ArrayList<>();
        ParkingSpot parkingSpot = new ParkingSpot(1, ParkingSpotSize.MEDIUM, ParkingSpotStatus.AVAILABLE);
        ParkingSpot parkingSpot2 = new ParkingSpot(2, ParkingSpotSize.COMPACT, ParkingSpotStatus.AVAILABLE);
        ParkingSpot parkingSpot3 = new ParkingSpot(3, ParkingSpotSize.LARGE, ParkingSpotStatus.AVAILABLE);
        ParkingSpot parkingSpot4 = new ParkingSpot(4, ParkingSpotSize.HANDICAPPED, ParkingSpotStatus.AVAILABLE);
        ParkingSpot parkingSpot5 = new ParkingSpot(4, ParkingSpotSize.ELECRIC_VEHICLE, ParkingSpotStatus.AVAILABLE);
        parkingSpotList.add(parkingSpot);
        parkingSpotList.add(parkingSpot2);
        parkingSpotList.add(parkingSpot3);
        parkingSpotList.add(parkingSpot4);
        parkingSpotList.add(parkingSpot5);
        ParkingFloor parkingFloor = new ParkingFloor(1, parkingSpotList);
        ParkingFloor parkingFloor1 = new ParkingFloor(2, parkingSpotList);
        ParkingFloor parkingFloor2 = new ParkingFloor(3, parkingSpotList);
        ParkingFloor parkingFloor3 = new ParkingFloor(4, parkingSpotList);
        ParkingFloor parkingFloor4 = new ParkingFloor(5, parkingSpotList);
        parkingFloors.add(parkingFloor);
        parkingFloors.add(parkingFloor1);
        parkingFloors.add(parkingFloor2);
        parkingFloors.add(parkingFloor3);
        parkingFloors.add(parkingFloor4);

    }

    @Override
    public void doRegisterObserver(AdminObserver adminObserver) {
        adminObservers.add(adminObserver);
    }

    @Override
    public void doRemoveObserver(AdminObserver adminObserver) {
        adminObservers.remove(adminObserver);
    }

    @Override
    public void doNotifyObserver(ParkingSpot parkingSpot) {
        AdminObserver adminObserver = new AdminObserverImplementation();
        parkingSpot.setParkingStatus(ParkingSpotStatus.AVAILABLE);
        adminObserver.notifyAvailableSpot(parkingSpot);
    }
}
