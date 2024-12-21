package org.Ecommerce;

import java.util.List;

public class User {

    EcommerceWebSite ecommerceWebSite;
    List<User> userList;
    String username;
    String password;

    public void forgotPassword() {

    }



    public void login(String username,String password) {
        userList=ecommerceWebSite.getUsers();
    }

    private boolean authenticateUser(String name, String password) {
        return userList.stream().anyMatch(user -> user.username.equals(name) && user.password.equals(password));
    }
    public void logout() {

    }

    public void addItemToCart() {

    }

    public void removeItemToCart() {

    }


    public void addProductReview() {
    }

    public void proceedToBuy()
    {

    }
}
