package org.designpatterns.BehaviouralDesignPattern.State;

public class Solution {
    public static void main(String args[])
    {

        VendingMachineContext vendingMachineContext=new VendingMachineContext(new VendingMachineInsertCoin());
        vendingMachineContext.insertCoin();
        vendingMachineContext.itemSelection();
        vendingMachineContext.dispense();

    }
}
