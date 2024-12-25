package org.Ecommerce.payments;

import org.Ecommerce.exception.InSufficientBalanceException;

public interface PaymentService {

    void pay(double amount) throws InSufficientBalanceException;

}
