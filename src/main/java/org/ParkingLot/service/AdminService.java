/*
package org.ParkingLotSystem.service;

import org.ParkingLotSystem.constants.ParkingStatus;
import org.ParkingLotSystem.constants.SpotSize;
import org.ParkingLotSystem.constants.VehicleType;
import org.ParkingLotSystem.model.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdminService {
    Admin admin;
    ExitPanelService exitPanel;


    public HashMap<Vehicle, ParkingFloor> checkSpaceForVehicle(Vehicle vehicle) {
        HashMap<Vehicle, ParkingFloor> mappingVehicle = new HashMap<>();
        for (ParkingFloor parkingFloor : admin.getParkingFloorList()) {
            List<ParkingSpotStatus> parkingSpotList = parkingFloor.getParkingSpotList();
            for (ParkingSpotStatus parkingSpot1 : parkingSpotList) {
                if (parkingSpot1.getParkingStatus() == ParkingStatus.AVAILABLE) {
                    if (vehicle.getVehicleType() == VehicleType.CAR && parkingSpot1.getSpotSize() == SpotSize.MEDIUM) {
                        mappingVehicle.put(vehicle, parkingFloor);
                        admin.setParkingSpot(parkingSpot1);
                    } else if (vehicle.getVehicleType() == VehicleType.BIKE && parkingSpot1.getSpotSize() == SpotSize.SMALL) {
                        mappingVehicle.put(vehicle, parkingFloor);
                        admin.setParkingSpot(parkingSpot1);
                    } else if (vehicle.getVehicleType() == VehicleType.TRUCK && parkingSpot1.getSpotSize() == SpotSize.LARGE) {
                        mappingVehicle.put(vehicle, parkingFloor);
                        admin.setParkingSpot(parkingSpot1);
                    }
                }
            }

        }
        return mappingVehicle;
    }

    public void removeAllocatedSpace(VehicleTicket ticket) {
        double amount = exitPanel.calculateFare(ticket);
        exitPanel.payFare(amount);
        ParkingSpotStatus parkingSpot = ticket.getParkingSpot();
        parkingSpot.setParkingStatus(ParkingStatus.AVAILABLE);

    }

    public Map<ParkingFloor, List<ParkingSpotStatus>> VacantList() {
        List<ParkingSpotStatus> vacantList = admin.getVacantList();
        Map<ParkingFloor, List<ParkingSpotStatus>> parkingFloorListMap = new HashMap<>();
        for (ParkingFloor parkingFloor : admin.getParkingFloorList()) {

            List<ParkingSpotStatus> parkingSpotList = parkingFloor.getParkingSpotList();
            for (ParkingSpotStatus parkingSpot : parkingSpotList) {
                if (parkingSpot.getParkingStatus() == ParkingStatus.AVAILABLE) {
                    vacantList.add(parkingSpot);
                }

            }
            parkingFloorListMap.put(parkingFloor, vacantList);

        }
        return parkingFloorListMap;

    }


}
*/
