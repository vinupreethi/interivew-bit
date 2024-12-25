package org.bookmyShow.model;

import org.bookmyShow.service.BookMyShowAppService;
import org.bookmyShow.service.Search;

import java.util.List;
import java.util.Scanner;

public class User {
    String username;
    String password;
    Search search;
    Ticket ticket;
    BookMyShowAppService bookMyShowApp;
    int balance;

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

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }

    public BookMyShowAppService getBookMyShowApp() {
        return bookMyShowApp;
    }

    public void setBookMyShowApp(BookMyShowAppService bookMyShowApp) {
        this.bookMyShowApp = bookMyShowApp;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


}
