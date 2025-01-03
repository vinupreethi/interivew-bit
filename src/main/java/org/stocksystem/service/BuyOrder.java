package org.stocksystem.service;

import org.stocksystem.Strategy.OrderStrategy;
import org.stocksystem.constants.OrderStatus;
import org.stocksystem.exception.InSufficientBalance;

public class BuyOrder extends Order{
    public BuyOrder(String orderId, Account account, Stock stock, int quantity, double price, OrderStatus status, OrderStrategy orderStrategy,Investor investor) {
        super(orderId, account, stock, quantity, price, status,orderStrategy,investor);
    }

    @Override
    public void executeTheProcess() throws InSufficientBalance {
        double totalAmount= quantity * price;
        status=OrderStatus.PENDING;
        account.withdrawal(totalAmount);
        status=OrderStatus.COMPLETED;
    }


}
