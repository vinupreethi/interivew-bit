package org.ParkingLotWithDesign.service;



import org.ParkingLotWithDesign.Factory.Vehicle;
import org.ParkingLotWithDesign.ParkingStrategy.LargeCarStrategy;
import org.ParkingLotWithDesign.ParkingStrategy.ParkingStrategy;
import org.ParkingLotWithDesign.constants.ParkingSpotStatus;
import org.ParkingLotWithDesign.model.Customer;
import org.ParkingLotWithDesign.model.ParkingSpot;
import org.ParkingLotWithDesign.model.Ticket;

import java.util.Optional;

public class EntryPanelService {

    //display board
    //generate entry ticket


    private AdminService adminService;
    private Customer customer;
    private Vehicle vehicle;
    private Ticket ticket;


    public void VehicleEntry() throws ParkingLotisFullException {
        ParkingStrategy parkingStrategy= customer.getParkingStrategy();
        Optional<ParkingSpot> parkingSpot = Optional.ofNullable(parkingStrategy.selectSpot(customer,adminService.getAvailableParkingSpot()));
        Ticket ticket=generateTicket(customer);
        if (parkingSpot.isPresent()) {
            parkingSpot.get().setParkingStatus(ParkingSpotStatus.OCCUPIED);
        } else {
            throw new ParkingLotisFullException("Parking lot is full");
        }
    }

    private Ticket generateTicket(Customer customer) {
        Ticket ticket1 = new Ticket();
        ticket1.setInTime(System.currentTimeMillis());
        ticket1.setTicketId(1234);
        ticket1.setCustomer(customer);
        ticket1.setVehicle(customer.getVehicle());
        return ticket1;
    }

}
