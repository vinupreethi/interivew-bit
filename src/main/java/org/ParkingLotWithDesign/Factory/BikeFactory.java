package org.ParkingLotWithDesign.Factory;

import org.ParkingLotWithDesign.model.VehicleFactory;

public class BikeFactory extends VehicleFactory {
    @Override
    protected Vehicle createVehicle() {
        return new Bike();
    }
}
