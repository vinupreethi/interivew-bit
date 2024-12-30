package org.ParkingLotWithDesign.FeeStrategy;

import org.ParkingLotWithDesign.model.Ticket;

public class BikeParkingFeeStrategy implements ParkingFeeStrategy{
    @Override
    public long calculateParkingTime(Ticket ticket, long currentTime) {
        return 20 * currentTime - ticket.getInTime();
    }
}
