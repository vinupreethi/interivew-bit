package org.ParkingLotWithDesign.FeeStrategy;

import org.ParkingLotWithDesign.model.Ticket;

public interface ParkingFeeStrategy {
    long calculateParkingTime(Ticket ticket, long currentTime);
}
