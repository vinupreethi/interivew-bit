package org.designpatterns.BehaviouralDesignPattern.State;

public interface VendingMachineState {
    void insertCoin(VendingMachineContext  vendingMachineContext);
    void selectItem(VendingMachineContext  vendingMachineContext);
    void dispatchMachine(VendingMachineContext  vendingMachineContext);
}
