package org.Ecommerce;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private String dateOfDelivery;
    private String estimatedDate;
    private List<Product> productList = new ArrayList<>();

    public OrderService(String estimatedDate) {
        this.estimatedDate = estimatedDate;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public void add(Product product) {
        productList.add(product);
    }

    public void changeTheOrderStatus(List<Product> productList) {
        for (Product product : productList) {
            product.setOrderStatus(OrderStatus.PLACED);
        }
    }

    public void TrackOrder(List<Product> productList)
    {
        for(Product product:productList)
        {
            System.out.println(product.getProductName()+" "+product.getOrderStatus());
        }
    }

    public String getDateOfDelivery() {
        return dateOfDelivery;
    }

    public void setDateOfDelivery(String dateOfDelivery) {
        this.dateOfDelivery = dateOfDelivery;
    }

    public void ProceedToDelivery(List<Product> cartList) {
    }
}
