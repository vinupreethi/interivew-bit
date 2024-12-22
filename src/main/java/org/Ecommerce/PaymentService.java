package org.Ecommerce;

public interface PaymentService {

    void pay(double amount) throws  InSufficientBalanceException;

}
