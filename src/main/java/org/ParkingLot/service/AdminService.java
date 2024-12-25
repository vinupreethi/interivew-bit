package org.ParkingLot.service;

import org.ParkingLot.constants.ParkingStatus;
import org.ParkingLot.constants.SpotSize;
import org.ParkingLot.constants.VehicleType;
import org.ParkingLot.model.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminService {
    Admin admin;
    ExitPanelService exitPanel;


    public HashMap<Vehicle, ParkingFloor> checkSpaceForVehicle(Vehicle vehicle) {
        HashMap<Vehicle, ParkingFloor> mappingVehicle = new HashMap<>();
        for (ParkingFloor parkingFloor : admin.getParkingFloorList()) {
            List<ParkingSpot> parkingSpotList = parkingFloor.getParkingSpotList();
            for (ParkingSpot parkingSpot : parkingSpotList) {
                if (parkingSpot.getParkingStatus() == ParkingStatus.AVAILABLE) {
                    if (vehicle.getVehicleType() == VehicleType.CAR && parkingSpot.getSpotSize() == SpotSize.MEDIUM) {
                        mappingVehicle.put(vehicle, parkingFloor);
                        admin.setParkingSpot(parkingSpot);
                    } else if (vehicle.getVehicleType() == VehicleType.BIKE && parkingSpot.getSpotSize() == SpotSize.SMALL) {
                        mappingVehicle.put(vehicle, parkingFloor);
                        admin.setParkingSpot(parkingSpot);
                    } else if (vehicle.getVehicleType() == VehicleType.TRUCK && parkingSpot.getSpotSize() == SpotSize.LARGE) {
                        mappingVehicle.put(vehicle, parkingFloor);
                        admin.setParkingSpot(parkingSpot);
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
        parkingSpot.setParkingStatus(ParkingStatus.AVAILABLE);

    }

    public Map<ParkingFloor, List<ParkingSpot>> VacantList() {
        List<ParkingSpot> vacantList = admin.getVacantList();
        Map<ParkingFloor, List<ParkingSpot>> parkingFloorListMap = new HashMap<>();
        for (ParkingFloor parkingFloor : admin.getParkingFloorList()) {

            List<ParkingSpot> parkingSpotList = parkingFloor.getParkingSpotList();
            for (ParkingSpot parkingSpot : parkingSpotList) {
                if (parkingSpot.getParkingStatus() == ParkingStatus.AVAILABLE) {
                    vacantList.add(parkingSpot);
                }

            }
            parkingFloorListMap.put(parkingFloor, vacantList);

        }
        return parkingFloorListMap;

    }


}
