package org.UberSystemDesign.VehicleFactory;

public class AutoFactory implements VehicleFactory{

    @Override
    public Vehicle createVehicle() {
        return new Auto();
    }
}
