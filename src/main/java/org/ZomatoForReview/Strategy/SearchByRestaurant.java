package org.ZomatoForReview.Strategy;

import org.ZomatoForReview.model.Restaurant;
import org.ZomatoForReview.model.ZomatoApp;


public class SearchByRestaurant implements SearchStrategy {
    private ZomatoApp zomatoApp;

    public SearchByRestaurant(ZomatoApp zomatoApp) {
        this.zomatoApp = zomatoApp;
    }

    @Override
    public Restaurant searchQuery(String restaurantName, String city) {
        return zomatoApp.getRestaurantcitylist().get(city).stream().filter(restaurant -> restaurant.getName().equals(restaurantName)).findFirst().orElse(null);
    }
}
