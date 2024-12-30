package org.ParkingLotWithDesign.FeeStrategy;

import org.ParkingLotWithDesign.model.Ticket;

public class VehicleFeeSelector implements VehicleFeeContext {
    ParkingFeeStrategy parkingFeeStrategy;

    public VehicleFeeSelector(ParkingFeeStrategy parkingFeeStrategy)
    {
        this.parkingFeeStrategy=parkingFeeStrategy;
    }

    @Override
    public long payVehicleFee(Ticket ticket,long currentTime) {
        return parkingFeeStrategy.calculateParkingTime(ticket,currentTime);
    }
}
