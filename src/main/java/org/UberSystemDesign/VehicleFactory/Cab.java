package org.UberSystemDesign.VehicleFactory;

public class Cab implements Vehicle{
    @Override
    public double payment(double distance) {
        return distance * 40;
    }
}
