package org.stocksystem.service;


import java.util.ArrayList;
import java.util.List;

public class Investor  {
    private String username;
    private String password;
    private String phoneNo;
    private Account account;
    List<Stock> holdings = new ArrayList<>();
    List<Stock> watchList=new ArrayList<>();
    StockManager stockManager=new StockManager();

    public List<Stock> getWatchList() {
        return watchList;
    }

    public void setWatchList(List<Stock> watchList) {
        this.watchList = watchList;
    }

    public StockManager getStockManager() {
        return stockManager;
    }

    public void setStockManager(StockManager stockManager) {
        this.stockManager = stockManager;
    }

    public List<Stock> getHoldings() {
        return holdings;
    }

    public void setHoldings(List<Stock> holdings) {
        this.holdings = holdings;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Investor(String username, String password, String phoneNo) {
        this.username = username;
        this.password = password;
        this.phoneNo = phoneNo;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }





}
