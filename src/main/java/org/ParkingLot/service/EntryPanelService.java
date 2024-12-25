package org.ParkingLot.service;

import org.ParkingLot.exception.ParkingLotFullException;
import org.ParkingLot.model.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntryPanelService {
    AdminService adminservice;
    Customer customer;
    Admin admin;

    public void DisplayBoard() throws ParkingLotFullException {
        Map<ParkingFloor, List<ParkingSpot>> vacantList = adminservice.VacantList();
        if (vacantList == null || vacantList.isEmpty()) {
            throw new ParkingLotFullException("Parking lot is full");
        } else {
            for (Map.Entry<ParkingFloor, List<ParkingSpot>> parkingFloorListEntry : vacantList.entrySet()) {
                System.out.println(parkingFloorListEntry.getKey() + " " + parkingFloorListEntry.getValue());
            }
        }
    }

    public void generateTicket(Vehicle vehicle) {
        HashMap<Vehicle, ParkingFloor> vehicleSpot = adminservice.checkSpaceForVehicle(vehicle);
        ParkingSpot vacantparkingSpot = admin.getParkingSpot();
        VehicleTicket vehicleTicket = new VehicleTicket(System.currentTimeMillis() / 3600, vehicle, vehicleSpot.get(vehicle), vacantparkingSpot);
        System.out.println("Ticket has been generated " + vehicleTicket);
        customer.parkVehicle(vacantparkingSpot);
    }

    public void payFare(double amount) {
        customer.payFare(amount);
    }
}
