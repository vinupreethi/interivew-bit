package org.designpatterns.StructuralDesignPatterns.bridge;

public class AutomaticTransmission implements Transmission {
    @Override
    public void applyTransmission() {
        System.out.println("Automatic is applied");
    }
}
