package org.designpatterns.StructuralDesignPatterns.bridge;

public class Truck extends Vehicle{
    Transmission transmission;
    Truck(Transmission transmission)
    {
        this.transmission=transmission;
    }

    @Override
    void applyTransmission() {
        transmission.applyTransmission();;
    }
}
