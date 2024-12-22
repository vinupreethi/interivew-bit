package org.Ecommerce;

public class InSufficientBalanceException extends Exception {
    InSufficientBalanceException(String message)
    {
        super(message);
    }
}
