package org.Ecommerce.services;

import org.Ecommerce.Constants.OrderStatus;
import org.Ecommerce.Constants.PaymentMode;
import org.Ecommerce.exception.InSufficientBalanceException;
import org.Ecommerce.models.Account;
import org.Ecommerce.models.Address;
import org.Ecommerce.models.Product;
import org.Ecommerce.payments.*;
import org.Ecommerce.searchServices.*;


import java.util.List;
import java.util.Scanner;

public class Buyer {
    private List<Product> cartList;
    private Account account;
    private EcommerceWebSite ecommerceWebSite;
    private String username;
    private String password;
    private String phoneNumber;
    private String emailId;
    private Address address;
    private Cart cart;
    private Search search;
    private PaymentService paymentService;
    private OrderService order;
    private DeliveryAgent deliveryAgent;
    Scanner scanner = new Scanner(System.in);

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Buyer(String Username, String password) {
        this.username = Username;
        this.password = password;
    }

    public Buyer(String Username, String password, String phoneNumber, String emailId, Address address) {
        this.username = Username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.emailId = emailId;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getUsername() {
        return username;
    }


    public void setUsername(String Username) {
        this.username = Username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void searchItem() {
        System.out.println("Which product category you want to search");
        System.out.println("1. Clothing and accessories");
        System.out.println("2. Health and personal care");
        System.out.println("3. Books");
        System.out.println("4. Furniture");
        System.out.println("5. Electronics");
        System.out.println("6. Home and kitchen");
        System.out.println("7. Search by product name");
        int options = scanner.nextInt();
        Search search;
        switch (options) {
            case 1:
                search = new SearchClothingProducts();
                search.sortByBrand();
                break;
            case 2:
                search =  new SearchHealthProducts();
                search.sortByLowToHighPrice();
                break;
            case 3:
                search =  new SearchBooks();
                search.sortByCustomerReviews();
                break;
            case 4:
                search = new SearchFurniture();
                search.sortByCustomerReviews();
                break;
            case 5:
                search = new SearchElectronics();
                search.sortByBrand();
                break;
            case 6:
                search =  new SearchHomeAndKitchenProducts();
                search.sortByLowToHighPrice();
                break;
            case 7:
                search =  new GeneralCategory();
                search.sortByLowToHighPrice();


        }
    }

    public void addItemToCart(Product product) {
        cart.addItemTocart(product, cartList);

    }

    public void removeItemToCart(Product product) {
        cart.removeFromCart(product, cartList);
    }


    public void proceedToBuy() throws InSufficientBalanceException {
        cart.proceedToBuy(cartList);
    }


    public void proceedToPayment(double totalAmount, List<Product> productList) throws InSufficientBalanceException {
        try {
            System.out.println("Select the mode of payment");
            System.out.println("Enter the payment mode");
            Scanner scanner = new Scanner(System.in);
            String paymentMode = scanner.next();
            if (paymentMode.equals(PaymentMode.DEBITCARD)) {
                paymentService = new DebitCardService("5211-2314-1234-1212", "Vinothini", "01/11/2027");
                paymentService.pay(totalAmount);
            } else if (paymentMode.equals(PaymentMode.CREDITCARD)) {
                paymentService = new CreditCardService("5211-2314-1234-1212", "Vinothini", "01/11/2027");
                paymentService.pay(totalAmount);
            } else if (paymentMode.equals(PaymentMode.ICICIBANK)) {
                paymentService = new UPIPaymentService("5211-2314-1234-1212", "Vinothini", "01/11/2027");
                paymentService.pay(totalAmount);
            } else if (paymentMode.equals(PaymentMode.UPI)) {
                paymentService = new NetBanking("Vinothini", "******");
                paymentService.pay(totalAmount);
            } else if (paymentMode.equals(PaymentMode.CASH_ON_DELIVERY)) {
                System.out.println("Needs to be paid at delivery");
            }
            for (Product product : productList) {
                product.setPaymentMode(PaymentMode.valueOf(paymentMode));
                cartList.add(product);
            }
            order.changeTheOrderStatus(productList);
            order.ProceedToDelivery(cartList);

        } catch (Exception e) {
            System.out.println("Order payment failed..!");
        }

    }

    public void cancelProductOnDoorStep(Product product, Buyer buyer) throws InSufficientBalanceException {
        deliveryAgent.cancelProduct(product, buyer);
    }

    public void TrackShippingStatus() {
        for (Product product : cartList) {
            if (product.getOrderStatus().equals(OrderStatus.PLACED)) {
                System.out.println(product.getProductName() + " " + product.getOrderStatus());
            }

        }

    }

    public void cancelOrder(Product product) {
        ecommerceWebSite.cancelOrder(product);
    }


}

