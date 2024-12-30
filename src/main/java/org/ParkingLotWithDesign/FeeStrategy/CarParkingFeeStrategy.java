package org.ParkingLotWithDesign.FeeStrategy;

import org.ParkingLotWithDesign.model.Ticket;

public class CarParkingFeeStrategy implements ParkingFeeStrategy{
    @Override
    public long calculateParkingTime(Ticket ticket, long currentTime) {
        return 50 * currentTime - ticket.getInTime();
    }
}
