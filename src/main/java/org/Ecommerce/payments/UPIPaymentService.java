package org.Ecommerce.payments;

import org.Ecommerce.exception.InSufficientBalanceException;
import org.Ecommerce.models.Account;

public class UPIPaymentService implements PaymentService {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private Account account;

    // Constructor to initialize the CreditCard object
    public UPIPaymentService(String cardNumber, String cardHolderName, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
    }

    @Override
    public void pay(double amount) throws InSufficientBalanceException {
        account.withdrawAmount(amount);
    }
}
