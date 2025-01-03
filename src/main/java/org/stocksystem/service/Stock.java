package org.stocksystem.service;

import org.stocksystem.StockSystem;
import org.stocksystem.exception.UnabletoBuyStockException;
import org.stocksystem.exception.UnabletoSellStockException;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String symbol;
    private String name;
    private double price;
    private String details;
    private StockSystem stockSystem;
    private List<BuyOrder> buyOrder=new ArrayList<>();
    private List<SellOrder> sellOrder=new ArrayList<>();

    public List<SellOrder> getSellOrder() {
        return sellOrder;
    }

    public void setSellOrder(List<SellOrder> sellOrder) {
        this.sellOrder = sellOrder;
    }

    public List<BuyOrder> getBuyOrder() {
        return buyOrder;
    }

    public void setBuyOrder(List<BuyOrder> buyOrder) {
        this.buyOrder = buyOrder;
    }

    public Stock(String symbol, String name, double price, String details) {
        this.symbol = symbol;
        this.name = name;
        this.price = price;
        this.details = details;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void changeStockPrice(Stock stock, double newPrice) throws UnabletoSellStockException, UnabletoBuyStockException {
        stock.setPrice(newPrice);
        stockSystem.notifyObserver(stock);
    }
}
