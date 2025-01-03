package org.stocksystem.service;

import org.stocksystem.Strategy.OrderContext;
import org.stocksystem.Strategy.OrderContextImpl;
import org.stocksystem.exception.InSufficientBalance;
import org.stocksystem.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class StockManager implements Observer {
    List<Investor> investorList = new ArrayList<>();

    private OrderContextImpl orderContext;



    public List<Investor> getInvestorList() {
        return investorList;
    }

    public void setInvestorList(List<Investor> investorList) {
        this.investorList = investorList;
    }

    @Override
    public void notifyStockSystemToBuy(Stock stock, BuyOrder buyOrder) throws InSufficientBalance {
        if (buyOrder.price >= stock.getPrice()) {
            buyOrder.executeTheProcess();
        }
    }

    @Override
    public void notifyStockSystemToSell(Stock stock, SellOrder sellOrder) {
        if (sellOrder.price >= stock.getPrice()) {
            sellOrder.executeTheProcess();

        }
    }
}
