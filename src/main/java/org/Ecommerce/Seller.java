package org.Ecommerce;

import java.util.ArrayList;
import java.util.List;

public class Seller {
    Account account;
    String username;
    String password;
    String phoneNo;
    String email;
    Address address;
    List<Product> sellerList = new ArrayList<>();

    public List<Product> getSellerList() {
        return sellerList;
    }

    public void setSellerList(List<Product> sellerList) {
        this.sellerList = sellerList;
    }

    public Seller(String sellername, String password, String phoneNumber, String emailId, Address address) {
        this.username = sellername;
        this.password = password;
        this.phoneNo = phoneNumber;
        this.email = emailId;
        this.address = address;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
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

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Seller(String username, String password, String phoneNo, String email, Address address, Account account) {
        this.username = username;
        this.email = email;
        this.phoneNo = phoneNo;
        this.account = account;
        this.address = address;
    }

    public Seller(String username, String password) {
    }


    public void addProduct(Product product) {
        sellerList.add(product);
    }

    public void removeProduct(Product product) {
        sellerList.remove(product);
    }

    public void ShipProduct(Product product) {
        product.setOrderStatus(OrderStatus.SHIPPED);
    }


    public void initiateRefund(Product product, Buyer buyer) throws InSufficientBalanceException {
        Account sellerAccount = product.getSeller().getAccount();
        Account buyerAccount = buyer.getAccount();
        if (sellerAccount.getBalance() >= 0) {
            sellerAccount.withdrawAmount(product.getPrice());
            buyerAccount.depositAmount(product.getPrice());
        }
        else
            throw new InSufficientBalanceException("Balance is insufficient");
    }

}
