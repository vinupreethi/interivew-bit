package org.Ecommerce.models;

public class Account {
    private String username;
    private String emailId;
    private String password;
    private String phoneNo;
    private Address address;
    private Double balance;

    public Account(String username, String password) {
        this.username=username;
        this.password=password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean checkBalance() {
        if(balance>0)
            return true;
        return false;
    }

    public double withdrawAmount(double price) {
       return balance-=price;
    }

    public double depositAmount(double price)
    {
        return balance+=price;
    }

    public double getBalance() {
        return balance;
    }
}
