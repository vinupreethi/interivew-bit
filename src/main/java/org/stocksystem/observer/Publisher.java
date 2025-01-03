package org.stocksystem.observer;

import org.stocksystem.exception.UnabletoBuyStockException;
import org.stocksystem.exception.UnabletoSellStockException;
import org.stocksystem.service.Stock;

public interface Publisher {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(Stock stock) throws UnabletoBuyStockException, UnabletoSellStockException;
}
