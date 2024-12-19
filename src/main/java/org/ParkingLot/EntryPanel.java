package org.ParkingLot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntryPanel {
    Admin admin;
    Customer customer;
    public void DisplayBoard() {
        Map<ParkingFloor, List<ParkingSpot>> vacantList= admin.VacantList();
        for(Map.Entry<ParkingFloor,List<ParkingSpot>> parkingFloorListEntry: vacantList.entrySet())
        {
            System.out.println(parkingFloorListEntry.getKey()+" "+parkingFloorListEntry.getValue());
        }
    }

    public void generateTicket(Vehicle vehicle) {
        HashMap<Vehicle,ParkingFloor> vehicleSpot=admin.checkSpaceForVehicle(vehicle);
        ParkingSpot vacantparkingSpot=admin.getParkingSpot();
        VehicleTicket vehicleTicket=new VehicleTicket(System.currentTimeMillis()/3600,vehicle,vehicleSpot.get(vehicle),vacantparkingSpot);
        System.out.println("Ticket has been generated "+vehicleTicket);
        customer.parkVehicle(vacantparkingSpot);
    }


}
