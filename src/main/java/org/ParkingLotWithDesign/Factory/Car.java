package org.ParkingLotWithDesign.Factory;

public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("car is being driven");
    }
}
