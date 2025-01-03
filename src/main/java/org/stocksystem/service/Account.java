package org.stocksystem.service;

import org.stocksystem.exception.InSufficientBalance;

public class Account {
    private double balance;
    private String name;
    private String username;
    private String password;

    public Account(double balance, String name, String username, String password) {
        this.balance = balance;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void withdrawal(double amount) throws InSufficientBalance {
        if (balance - amount >= 0)
            balance = balance - amount;
        else
            throw new InSufficientBalance("Balance is insufficient");
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public double checkBalance() {
        return balance;
    }

}
