package org.designpatterns.StructuralDesignPatterns.bridge;

public class Bridge {
    public static void main(String args[])
    {

        Vehicle vehicle=new Car(new AutomaticTransmission());
        vehicle.applyTransmission();
    }
}
