package org.designpatterns.BehaviouralDesignPattern.State;

public class VendingMachineContext {
    private VendingMachineState vendingMachineState;

    public VendingMachineContext(VendingMachineState vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public void setState(VendingMachineState vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public void insertCoin() {
        vendingMachineState.insertCoin(this);
    }

    public void itemSelection() {
        vendingMachineState.selectItem(this);
    }

    public void dispense() {
        vendingMachineState.dispatchMachine(this);
        ;
    }
}
