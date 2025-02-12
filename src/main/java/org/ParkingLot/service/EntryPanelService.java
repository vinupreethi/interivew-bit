/*
package org.ParkingLotSystem.service;

import org.ParkingLotSystem.exception.ParkingLotFullException;
import org.ParkingLotSystem.model.*;
import org.ParkingLotWithDesign.service.AdminService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntryPanelService {
    AdminService adminservice;
    Customer customer;
    Admin admin;

    public void DisplayBoard() throws ParkingLotFullException {
        Map<ParkingFloor, List<ParkingSpotStatus>> vacantList = adminservice.vacantList();
        if (vacantList == null || vacantList.isEmpty()) {
            throw new ParkingLotFullException("Parking lot is full");
        } else {
            for (Map.Entry<ParkingFloor, List<ParkingSpotStatus>> parkingFloorListEntry : vacantList.entrySet()) {
                System.out.println(parkingFloorListEntry.getKey() + " " + parkingFloorListEntry.getValue());
            }
        }
    }

    public void generateTicket(Vehicle vehicle) {
        HashMap<Vehicle, ParkingFloor> vehicleSpot = adminservice.checkSpaceForVehicle(vehicle);
        ParkingSpotStatus vacantparkingSpot = admin.getParkingSpot();
        VehicleTicket vehicleTicket = new VehicleTicket(System.currentTimeMillis() / 3600, vehicle, vehicleSpot.get(vehicle), vacantparkingSpot);
        System.out.println("Ticket has been generated " + vehicleTicket);
        customer.parkVehicle(vacantparkingSpot);
    }

    public void payFare(double amount) {
        customer.payFare(amount);
    }
}
*/
