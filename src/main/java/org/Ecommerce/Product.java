package org.Ecommerce;


import java.util.List;
import java.util.Scanner;

public class Product {
    private String productName;
    private String colour;
    private float rating;
    private int price;
    private String brand;
    private List<String> comments;
    private Seller seller;
    private PaymentMode paymentMode;
    private OrderStatus orderStatus;
    private Buyer buyer;
    private String estimatedDate;

    public String getEstimatedDate() {
        return estimatedDate;
    }

    public void setEstimatedDate(String estimatedDate) {
        this.estimatedDate = estimatedDate;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public int getPrice() {
        return price;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }



    public void setPrice(int price) {
        this.price = price;
    }




    public void addRating(Product product) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the rating");
        float rating=scanner.nextFloat();
        product.setRating(rating);
    }
}
