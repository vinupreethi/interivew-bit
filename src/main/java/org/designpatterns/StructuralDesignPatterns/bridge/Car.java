package org.designpatterns.StructuralDesignPatterns.bridge;

public class Car extends Vehicle{
    Transmission transmission;
    Car(Transmission transmission)
    {
        this.transmission=transmission;
    }

    @Override
    void applyTransmission() {
        transmission.applyTransmission();;
    }
}
