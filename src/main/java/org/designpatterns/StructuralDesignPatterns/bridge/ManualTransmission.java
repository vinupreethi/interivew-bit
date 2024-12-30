package org.designpatterns.StructuralDesignPatterns.bridge;

public class ManualTransmission implements Transmission{
    @Override
    public void applyTransmission() {
        System.out.println("Manual is applied");
    }
}
