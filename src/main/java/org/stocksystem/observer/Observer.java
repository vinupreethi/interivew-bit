package org.stocksystem.observer;

import org.stocksystem.exception.InSufficientBalance;
import org.stocksystem.service.BuyOrder;
import org.stocksystem.service.SellOrder;
import org.stocksystem.service.Stock;


public interface Observer {
    void notifyStockSystemToBuy(Stock stock, BuyOrder buyOrder) throws InSufficientBalance;
    void notifyStockSystemToSell( Stock stock, SellOrder sellOrder);
}





