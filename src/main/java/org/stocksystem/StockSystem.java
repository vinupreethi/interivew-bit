package org.stocksystem;


import org.bookmyShow.model.User;
import org.stocksystem.Strategy.LimitBuyOrderStrategy;
import org.stocksystem.Strategy.LimitSellOrderStrategy;
import org.stocksystem.constants.OrderStatus;
import org.stocksystem.exception.InSufficientBalance;
import org.stocksystem.exception.UnabletoBuyStockException;
import org.stocksystem.exception.UnabletoSellStockException;
import org.stocksystem.observer.Observer;
import org.stocksystem.observer.Publisher;
import org.stocksystem.service.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockSystem implements Publisher {

    List<Observer> stockManagers = new ArrayList<>();
    List<Investor> investors = new ArrayList<>();
    private static volatile StockSystem stockSystem;

    private StockSystem(Observer observer) {

    }

    public StockSystem getInstance() {
        if (stockSystem == null) {
            synchronized (StockSystem.class) {
                if (stockSystem == null)
                    return stockSystem;
            }
        }
        return stockSystem;
    }



    public void registerUser() {
        Investor user = new Investor("vinu", "hello@123", "9999999999");
        if (saveToDb(user)) {
            System.out.println("UserName already exists..! Try with different username..");
            investors.add(user);
        } else
            System.out.println("User registered successfully..");

    }

    private boolean saveToDb(Investor user) {
        return investors.stream().anyMatch(currentUser -> currentUser.getUsername().equals(user.getUsername()));
    }


    @Override
    public void addObserver(Observer observer) {
        stockManagers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        stockManagers.remove(observer);
    }

    @Override
    public void notifyObserver(Stock stock) throws UnabletoBuyStockException, UnabletoSellStockException {
        for (Observer observer : stockManagers) {
            for (BuyOrder buyOrder : stock.getBuyOrder()) {
                try {
                    observer.notifyStockSystemToBuy(stock, buyOrder);
                } catch (Exception | InSufficientBalance e) {
                    throw new UnabletoBuyStockException("Unable to buy stock");
                }
            }
        }

        for (Observer observer : stockManagers) {
            for (SellOrder sellOrder : stock.getSellOrder()) {
                try {
                    observer.notifyStockSystemToSell(stock, sellOrder);
                } catch (Exception e) {
                    throw new UnabletoSellStockException("unable to sell stock");
                }
            }
        }

    }

    public void placeOrder() throws InSufficientBalance {
        Account account=new Account(1000,"vinu","vinu","123");
        Stock stock=new Stock("LLY","NVIDIA",123,"nvidia");
        Investor user = new Investor("vinu", "hello@123", "9999999999");
        Order order=new BuyOrder("123",account,stock,12,1000, OrderStatus.PENDING, new LimitBuyOrderStrategy(),user);
        order.executeTheProcess();
    }

    public void sellOrder() throws InSufficientBalance {
        Account account=new Account(1000,"vinu","vinu","123");
        Stock stock=new Stock("LLY","NVIDIA",123,"nvidia");
        Investor user = new Investor("vinu", "hello@123", "9999999999");
        Order order=new SellOrder("123",account,stock,12,1000, OrderStatus.PENDING, new LimitBuyOrderStrategy(),user);
        order.executeTheProcess();
    }
}
