package org.ParkingLot;

public class ExitPanel {

    Customer customer;
    public int calculateFare(VehicleTicket ticket) {

        long inTimeOftheVehice = ticket.getInTime();
        if (ticket.getVehicle().vehicleType == VehicleType.CAR) {
            return (int) (40 * (System.currentTimeMillis() / 3600 - inTimeOftheVehice));
        } else if (ticket.getVehicle().vehicleType == VehicleType.TRUCK) {
            return (int) (60 * (System.currentTimeMillis() / 3600 - inTimeOftheVehice));
        }

        return (int) (20 * (System.currentTimeMillis() / 3600 - inTimeOftheVehice));

    }

    public void payFare(double amount)
    {
        customer.payFare(amount);
    }


}
