/*
package org.ParkingLotSystem.service;

import org.ParkingLotSystem.constants.VehicleType;
import org.ParkingLotSystem.model.Customer;
import org.ParkingLotSystem.model.VehicleTicket;

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
*/
