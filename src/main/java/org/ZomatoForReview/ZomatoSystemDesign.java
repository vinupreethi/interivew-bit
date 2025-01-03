package org.ZomatoForReview;

import org.ZomatoForReview.AuthenticationStrategy.AuthenticationStrategy;
import org.ZomatoForReview.AuthenticationStrategy.EmailAuthentication;
import org.ZomatoForReview.Strategy.SearchByRestaurant;
import org.ZomatoForReview.model.Restaurant;
import org.ZomatoForReview.model.User;
import org.ZomatoForReview.model.ZomatoApp;


public class ZomatoSystemDesign {
    public static void main(String args[]) {
        ZomatoApp zomatoApp = ZomatoApp.getInstance();
        AuthenticationStrategy authenticationStrategy = new EmailAuthentication(zomatoApp);
        User user = new User("vinu", "****");
        authenticationStrategy.signUp(user);

        zomatoApp.setSearchStrategy(new SearchByRestaurant(zomatoApp));
        Restaurant restaurant = zomatoApp.searchQuery("A2B", "Chennai");

        zomatoApp.submitReview("nice", 5, user, restaurant);


    }
}
