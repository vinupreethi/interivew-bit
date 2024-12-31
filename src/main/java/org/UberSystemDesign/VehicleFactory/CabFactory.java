package org.UberSystemDesign.VehicleFactory;

public class CabFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new Cab();
    }
}
