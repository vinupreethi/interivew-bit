package org.designpatterns.BehaviouralDesignPattern.State;

public class VendingMachineDispense implements VendingMachineState{

    @Override
    public void insertCoin(VendingMachineContext vendingMachineContext) {
        System.out.println("Inserted");
    }

    @Override
    public void selectItem(VendingMachineContext vendingMachineContext) {
        System.out.println("Selected");
    }

    @Override
    public void dispatchMachine(VendingMachineContext vendingMachineContext) {
        System.out.println("Dispensed");
        vendingMachineContext.setState(new VendingMachineInsertCoin());
    }
}
