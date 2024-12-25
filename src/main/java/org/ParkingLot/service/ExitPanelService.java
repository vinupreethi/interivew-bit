package org.ParkingLot.service;

import org.ParkingLot.constants.VehicleType;
import org.ParkingLot.model.Customer;
import org.ParkingLot.model.VehicleTicket;

public class ExitPanelService {
    Customer customer;
    public int calculateFare(VehicleTicket ticket) {

        long inTimeOftheVehice = ticket.getInTime();
        if (ticket.getVehicle().getVehicleType() == VehicleType.CAR) {
            return (int) (40 * (System.currentTimeMillis() / 3600 - inTimeOftheVehice));
        } else if (ticket.getVehicle().getVehicleType() == VehicleType.TRUCK) {
            return (int) (60 * (System.currentTimeMillis() / 3600 - inTimeOftheVehice));
        }

        return (int) (20 * (System.currentTimeMillis() / 3600 - inTimeOftheVehice));

    }

    public void payFare(double amount)
    {
        customer.payFare(amount);
    }
}
