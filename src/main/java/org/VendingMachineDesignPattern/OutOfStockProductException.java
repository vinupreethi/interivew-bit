package org.VendingMachineDesignPattern;

public class OutOfStockProductException extends Throwable {
    OutOfStockProductException(String msg) {
        super(msg);
    }
}
