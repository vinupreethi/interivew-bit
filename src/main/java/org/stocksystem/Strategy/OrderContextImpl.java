package org.stocksystem.Strategy;

import org.stocksystem.exception.InSufficientBalance;
import org.stocksystem.service.Investor;
import org.stocksystem.service.Stock;

public class OrderContextImpl implements OrderContext {
    OrderStrategy orderStrategy;

    OrderContextImpl(OrderStrategy orderStrategy) {
        this.orderStrategy = orderStrategy;
    }


    @Override
    public void placeOrder(String orderId,int quantity, double price, Stock stock, Investor investor) throws InSufficientBalance {
        orderStrategy.executeOrder(orderId,quantity, price, stock, investor);
    }

}
