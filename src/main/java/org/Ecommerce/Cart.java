package org.Ecommerce;

import java.util.List;

public class Cart {
    private Seller seller;
    private Buyer buyer;

    void addItemTocart(Product product, List<Product> productList) {
        productList.add(product);
    }

    void removeFromCart(Product product, List<Product> productList) {
        productList.remove(product);
    }

    public void viewCart(List<Product> productList)
    {;
        for (Product product :productList) {
            System.out.println(product.getProductName());
            System.out.println(product.getPrice());
            System.out.println(product.getColour());
            System.out.println(product.getRating());
            System.out.println(product.getBrand());
        }
    }

    public int checkCartAmount(List<Product> cartList) {
        int totalamount = 0;
        for (Product product : cartList) {
            totalamount += product.getPrice();
        }
        return totalamount;
    }


    public void proceedToBuy(List<Product> cartList) throws InSufficientBalanceException {
        int totalAmount = checkCartAmount(cartList);
        buyer.proceedToPayment(totalAmount,cartList);

    }
}
