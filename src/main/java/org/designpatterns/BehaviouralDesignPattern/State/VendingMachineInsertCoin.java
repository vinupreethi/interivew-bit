package org.designpatterns.BehaviouralDesignPattern.State;

public class VendingMachineInsertCoin implements VendingMachineState {
    VendingMachineState machineState;

    @Override
    public void insertCoin(VendingMachineContext  vendingMachineContext) {
        System.out.println("Coin is inserted");
        vendingMachineContext.setState(new VendingMachineItemSelection());
    }

    @Override
    public void selectItem(VendingMachineContext  vendingMachineContext) {
        System.out.println("Without insertion of coin item cannot be selected");
    }

    @Override
    public void dispatchMachine(VendingMachineContext  vendingMachineContext) {
        System.out.println("Without selection of item dispatch cannot be done");

    }
}
