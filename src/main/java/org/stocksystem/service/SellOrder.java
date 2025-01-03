package org.stocksystem.service;

import org.stocksystem.Strategy.OrderStrategy;
import org.stocksystem.constants.OrderStatus;


public class SellOrder extends Order {
    public SellOrder(String orderId, Account account, Stock stock, int quantity, double price, OrderStatus status, OrderStrategy orderStrategy, Investor investor) {
        super(orderId, account, stock, quantity, price, status, orderStrategy, investor);
    }

    @Override
    public void executeTheProcess() {
        double totalAmount = quantity * price;
        status = OrderStatus.PENDING;
        account.deposit(totalAmount);
        status = OrderStatus.COMPLETED;
    }
}
