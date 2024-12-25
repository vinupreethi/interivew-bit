package org.ParkingLot.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Admin {
    String username;
    String phoneNumber;
    String password;
    ExitPanel exitPanel;
    ParkingSpot parkingSpot;
    List<ParkingFloor> parkingFloorList;
    List<ParkingSpot> vacantList = new ArrayList<>();
    HashMap<Vehicle, ParkingFloor> mappingVehicle = new HashMap<>();

    public Admin() {

    }


    public ExitPanel getExitPanel() {
        return exitPanel;
    }

    public void setExitPanel(ExitPanel exitPanel) {
        this.exitPanel = exitPanel;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public List<ParkingFloor> getParkingFloorList() {
        return parkingFloorList;
    }

    public void setParkingFloorList(List<ParkingFloor> parkingFloorList) {
        this.parkingFloorList = parkingFloorList;
    }

    public List<ParkingSpot> getVacantList() {
        return vacantList;
    }

    public void setVacantList(List<ParkingSpot> vacantList) {
        this.vacantList = vacantList;
    }

    public HashMap<Vehicle, ParkingFloor> getMappingVehicle() {
        return mappingVehicle;
    }

    public void setMappingVehicle(HashMap<Vehicle, ParkingFloor> mappingVehicle) {
        this.mappingVehicle = mappingVehicle;
    }




}
