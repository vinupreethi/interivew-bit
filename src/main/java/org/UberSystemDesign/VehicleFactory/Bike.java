package org.UberSystemDesign.VehicleFactory;

public class Bike implements Vehicle {

    @Override
    public double payment(double distance) {
        return distance * 20;
    }
}
