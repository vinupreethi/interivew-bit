package org.designpatterns.BehaviouralDesignPattern.State;

public class VendingMachineItemSelection implements VendingMachineState {
    VendingMachineState machineState;

    @Override
    public void insertCoin(VendingMachineContext  vendingMachineContext) {
        System.out.println("Coin is already inserted");
    }

    @Override
    public void selectItem(VendingMachineContext  vendingMachineContext) {
        System.out.println("Item is selected");
        vendingMachineContext.setState(new VendingMachineDispense());
    }

    @Override
    public void dispatchMachine(VendingMachineContext  vendingMachineContext) {
        System.out.println("Not yet selected item");
    }
}
