package org.Ecommerce.services;

import org.Ecommerce.Constants.OrderStatus;
import org.Ecommerce.models.Account;
import org.Ecommerce.models.Address;
import org.Ecommerce.models.Product;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EcommerceWebSite {

    List<Buyer> buyersList;
    List<Buyer> activebuyerList;
    List<Seller> sellerList;
    List<Seller> activesellerList;

    public List<Seller> getSellerList() {
        return sellerList;
    }

    public void setSellerList(List<Seller> sellerList) {
        this.sellerList = sellerList;
    }

    public List<Seller> getActivesellerList() {
        return activesellerList;
    }

    public void setActivesellerList(List<Seller> activesellerList) {
        this.activesellerList = activesellerList;
    }

    public void registerUserAsBuyer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the username: ");
        String username = scanner.next();
        System.out.println("Enter the password: ");
        String password = scanner.next();
        System.out.println("Enter the phoneNo: ");
        String phoneNo = scanner.next();
        System.out.println("Enter the email id");
        String email=scanner.next();
        System.out.println("Enter the Address: ");
        Address address = new Address(52, "Victoria towers, OMR", "Chennai", "TamilNadu", "620020", "India");
        Buyer buyer= new Buyer(username,password,phoneNo,email,address);
        buyer.setUsername(username);
        buyer.setPassword(password);
        buyer.setPhoneNumber(phoneNo);
        buyer.setAddress(address);
    }

    public void registerUserAsSeller() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the username: ");
        String username = scanner.next();
        System.out.println("Enter the password: ");
        String password = scanner.next();
        System.out.println("Enter the phoneNo: ");
        String phoneNo = scanner.next();
        System.out.println("Enter the email id");
        String email=scanner.next();
        System.out.println("Enter the Address: ");
        Address address = new Address(52, "Victoria towers, OMR", "Chennai", "TamilNadu", "620020", "India");
        Account account=new Account(username,password);
        Seller seller= new Seller(username,password,phoneNo,email,address,account);
        seller.setUsername(username);
        seller.setPassword(password);
        seller.setPhoneNo(phoneNo);
        seller.setAddress(address);
    }

    public List<Buyer> getBuyersList() {
        return buyersList;
    }

    public void setBuyersList(List<Buyer> buyersList) {
        this.buyersList = buyersList;
    }

    public List<Buyer> getActivebuyerList() {
        return activebuyerList;
    }

    public void setActivebuyerList(List<Buyer> activebuyerList) {
        this.activebuyerList = activebuyerList;
    }

    public int sendOtp() {
        int random = new Random().nextInt(999999) + 100000;
        return random;
    }

    public void forgotPassword(Buyer user) {
       resetPassword();
    }

    private void resetPassword() {
        Scanner scanner=new Scanner(System.in);
        List<Buyer> UserList = getBuyersList();
        System.out.println("How do you want to reset the password ");
        System.out.println("1. Phone number");
        System.out.println("2. Email id");
        Buyer current;
        int options = scanner.nextInt();
        switch (options) {
            case 1:
                System.out.println("1. Enter the phone number ");
                String phoneNo = scanner.next();
                current = UserList.stream().filter(User -> User.getPhoneNumber().equals(phoneNo)).findFirst().orElse(null);
                int otpPhoneNo = sendOtp();
                System.out.println("Enter the otp");
                int otpEnteredbyUser = scanner.nextInt();
                if (otpEnteredbyUser == otpPhoneNo) {
                    System.out.println("Enter the new password");
                    String newPassword = scanner.next();
                    current.setPassword(newPassword);

                } else {
                    System.out.println("Invalid OTP");
                }
                break;
            case 2:
                System.out.println("2. Enter the email Id ");
                String emailId = scanner.next();
                current = UserList.stream().filter(User -> User.getPhoneNumber().equals(emailId)).findFirst().orElse(null);
                int otpEmailId = sendOtp();
                System.out.println("Enter the otp");
                int otpEntered = scanner.nextInt();
                if (otpEntered == otpEmailId) {
                    System.out.println("Enter the new password");
                    String newPassword = scanner.next();
                    current.setPassword(newPassword);

                } else {
                    System.out.println("Invalid OTP");
                }
                break;
            default:
                break;

        }


    }


    public void loginasBuyer(String Username, String password) {
        List<Buyer> activeUserList = getActivebuyerList();
        if (authenticateBuyer(Username, password)) {
            Buyer buyer = new Buyer(Username, password);
            buyer.setUsername(Username);
            buyer.setPassword(password);
            activeUserList.add(buyer);
            System.out.println("User logged in");
        } else
            System.out.println("Invalid credentials");
    }

    private boolean authenticateBuyer(String name, String password) {
        List<Buyer> userList = getBuyersList();
        return userList.stream().anyMatch(user -> user.getUsername().equals(name) && user.getPassword().equals(password));
    }

    public void logoutBuyer(String Username, String password) {
        Buyer user = new Buyer(Username, password);
        List<Buyer> activeUserList = getActivebuyerList();
        activeUserList.remove(user);
    }

    public void loginasSeller(String username, String password) {
        List<Seller> activeUserList = getActivesellerList();
        if (authenticateSeller(username, password)) {
            Seller seller = new Seller(username, password);
            seller.setUsername(username);
            seller.setPassword(password);
            activeUserList.add(seller);
            System.out.println("User logged in");
        } else
            System.out.println("Invalid credentials");
    }

    private boolean authenticateSeller(String name, String password) {
        List<Seller> userList = getSellerList();
        return userList.stream().anyMatch(user -> user.username.equals(name) && user.password.equals(password));
    }

    public void logoutSeller(String username, String password) {
        Seller user = new Seller(username, password);
        List<Seller> activeUserList = getActivesellerList();
        activeUserList.remove(user);
    }


    public void cancelOrder(Product product) {
        product.setOrderStatus(OrderStatus.CANCELLED);
    }

    public void addRating(Product product) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the rating");
        float rating=scanner.nextFloat();
        product.setRating(rating);
    }

}
