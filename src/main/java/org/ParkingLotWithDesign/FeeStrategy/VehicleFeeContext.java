package org.ParkingLotWithDesign.FeeStrategy;

import org.ParkingLotWithDesign.model.Ticket;

public interface VehicleFeeContext {
   long payVehicleFee(Ticket ticket,long currentTime);
}
