package org.stocksystem.Strategy;

import org.stocksystem.exception.InSufficientBalance;
import org.stocksystem.service.Investor;
import org.stocksystem.service.Order;
import org.stocksystem.service.Stock;

public interface OrderContext {
    public void placeOrder(String orderId,int quantity, double price, Stock stock, Investor investor) throws InSufficientBalance;
}
