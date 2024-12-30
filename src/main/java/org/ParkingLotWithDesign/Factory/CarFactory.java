package org.ParkingLotWithDesign.Factory;

import org.ParkingLotWithDesign.model.VehicleFactory;


public class CarFactory extends VehicleFactory
{

    @Override
    protected Vehicle createVehicle() {
        return new Car();
    }
}
