package org.ParkingLot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Admin {
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

    public HashMap<Vehicle, ParkingFloor> checkSpaceForVehicle(Vehicle vehicle) {
        for (ParkingFloor parkingFloor : parkingFloorList) {
            List<ParkingSpot> parkingSpotList = parkingFloor.getParkingSpotList();
            for (ParkingSpot parkingSpot : parkingSpotList) {
                if (parkingSpot.parkingStatus == ParkingStatus.AVAILABLE) {
                    if (vehicle.vehicleType == VehicleType.CAR && parkingSpot.spotSize == SpotSize.MEDIUM) {
                        mappingVehicle.put(vehicle, parkingFloor);
                        this.parkingSpot = parkingSpot;
                    } else if (vehicle.vehicleType == VehicleType.BIKE && parkingSpot.spotSize == SpotSize.SMALL) {
                        mappingVehicle.put(vehicle, parkingFloor);
                        this.parkingSpot = parkingSpot;
                    } else if (vehicle.vehicleType == VehicleType.TRUCK && parkingSpot.spotSize == SpotSize.LARGE) {
                        mappingVehicle.put(vehicle, parkingFloor);
                        this.parkingSpot = parkingSpot;
                    }
                }
            }

        }
        return mappingVehicle;
    }

    public void removeAllocatedSpace(VehicleTicket ticket) {
        double amount = exitPanel.calculateFare(ticket);
        exitPanel.payFare(amount);
        ParkingSpot parkingSpot = ticket.getParkingSpot();
        parkingSpot.parkingStatus = ParkingStatus.AVAILABLE;

    }

    public Map<ParkingFloor, List<ParkingSpot>> VacantList() {
        Map<ParkingFloor, List<ParkingSpot>> parkingFloorListMap = new HashMap<>();
        for (ParkingFloor parkingFloor : parkingFloorList) {

            List<ParkingSpot> parkingSpotList = parkingFloor.getParkingSpotList();
            for (ParkingSpot parkingSpot : parkingSpotList) {
                if (parkingSpot.parkingStatus == ParkingStatus.AVAILABLE) {
                    vacantList.add(parkingSpot);
                }

            }
            parkingFloorListMap.put(parkingFloor, vacantList);

        }
        return parkingFloorListMap;

    }


}
