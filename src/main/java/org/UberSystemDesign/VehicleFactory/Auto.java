package org.UberSystemDesign.VehicleFactory;

public class Auto implements Vehicle{

    @Override
    public double payment(double distance) {
        return distance * 10;
    }
}
