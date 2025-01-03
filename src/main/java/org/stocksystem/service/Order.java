package org.stocksystem.service;


import org.stocksystem.Strategy.OrderStrategy;
import org.stocksystem.constants.OrderStatus;
import org.stocksystem.exception.InSufficientBalance;

public abstract class Order {
    protected  String orderId;
    protected  Account account;
    protected  Stock stock;
    protected  int quantity;
    protected  double price;
    public String getOrderId() {
        return orderId;
    }

    public Order(String orderId, Account account, Stock stock, int quantity, double price, OrderStatus status,OrderStrategy orderStrategy,Investor investor) {
        this.orderId = orderId;
        this.account = account;
        this.stock = stock;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
        this.orderStrategy=orderStrategy;
        this.investor=investor;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public OrderStrategy getOrderStrategy() {
        return orderStrategy;
    }

    public void setOrderStrategy(OrderStrategy orderStrategy) {
        this.orderStrategy = orderStrategy;
    }

    public Investor getInvestor() {
        return investor;
    }

    public void setInvestor(Investor investor) {
        this.investor = investor;
    }

    protected OrderStatus status;
    protected OrderStrategy orderStrategy;
    protected Investor investor;



    abstract public void executeTheProcess() throws InSufficientBalance;
}
