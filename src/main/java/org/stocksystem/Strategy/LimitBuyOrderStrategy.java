package org.stocksystem.Strategy;

import org.stocksystem.constants.OrderStatus;
import org.stocksystem.exception.InSufficientBalance;
import org.stocksystem.service.BuyOrder;
import org.stocksystem.service.Investor;
import org.stocksystem.service.Stock;

public class LimitBuyOrderStrategy implements OrderStrategy {
    @Override
    public void executeOrder(String orderId, int quantity, double price, Stock stock, Investor investor) throws InSufficientBalance {
        BuyOrder buyOrder = new BuyOrder(orderId, investor.getAccount(), stock, quantity, price, OrderStatus.PENDING, this, investor);
        buyOrder.executeTheProcess();
    }
}
