package org.ParkingLotWithDesign.model;

import org.ParkingLotWithDesign.Factory.Vehicle;

public abstract class VehicleFactory {
    protected abstract Vehicle createVehicle();
}
