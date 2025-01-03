package org.stocksystem.Strategy;

import org.stocksystem.exception.InSufficientBalance;
import org.stocksystem.service.Investor;
import org.stocksystem.service.Stock;

public interface OrderStrategy {
    void executeOrder(String orderId,int quantity, double price, Stock stock, Investor investor) throws InSufficientBalance;
}
