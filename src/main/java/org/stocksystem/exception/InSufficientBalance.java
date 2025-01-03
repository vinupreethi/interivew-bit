package org.stocksystem.exception;

public class InSufficientBalance extends Throwable {
    public InSufficientBalance(String balanceIsInsufficient) {
        super(balanceIsInsufficient);
    }
}
