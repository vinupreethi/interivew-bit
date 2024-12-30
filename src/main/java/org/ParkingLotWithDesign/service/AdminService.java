package org.ParkingLotWithDesign.service;

import org.ParkingLotWithDesign.ParkingStrategy.ParkingStrategy;
import org.ParkingLotWithDesign.constants.ParkingSpotStatus;
import org.ParkingLotWithDesign.model.ParkingFloor;
import org.ParkingLotWithDesign.model.ParkingSpot;


import java.util.List;
import java.util.stream.Collectors;

public class AdminService {

    private String username;
    private String password;
    private String phoneNumber;
    private ParkingLot parkingLot = ParkingLot.getInstance();
    private List<ParkingSpot> availableParkingSpot;
    private List<AdminObserver> adminObservers;
    private ParkingStrategy parkingStrategy;

    public ParkingStrategy getParkingStrategy() {
        return parkingStrategy;
    }

    public void setParkingStrategy(ParkingStrategy parkingStrategy) {
        this.parkingStrategy = parkingStrategy;
    }

    public List<ParkingSpot> getAvailableParkingSpot() {
        return availableParkingSpot;
    }

    public void setAvailableParkingSpot(List<ParkingSpot> availableParkingSpot) {
        this.availableParkingSpot = availableParkingSpot;
    }


    public void createAllotmentSpace() {
        parkingLot.initializeParkingLot();
    }

    public void checkAllVacantSpots() {
        List<ParkingFloor> parkingFloorList = parkingLot.getParkingFloors();
        availableParkingSpot.addAll(parkingFloorList.stream().flatMap(parkingFloor -> parkingFloor.getParkingSpotList().stream()).filter(parkingSpot -> parkingSpot.getParkingStatus().equals(ParkingSpotStatus.AVAILABLE)).collect(Collectors.toList()));
    }

    public void displayVacantSpots() {
        for (ParkingSpot available : availableParkingSpot) {
            System.out.println(available.getParkingSpotNo() + " " + available.getParkingSpotNo());
        }
    }




}
