package org.ZomatoForReview.Strategy;

import org.ZomatoForReview.model.Restaurant;
import org.ZomatoForReview.model.ZomatoApp;

public class SearchByLocation implements SearchStrategy {
    private ZomatoApp zomatoApp;

    public SearchByLocation(ZomatoApp zomatoApp) {
        this.zomatoApp = zomatoApp;
    }

    @Override
    public Restaurant  searchQuery(String location, String city) {
        return zomatoApp.getRestaurantcitylist().get(city).stream().filter(restaurant -> restaurant.getLocation().equals(location)).findFirst().orElse(null);
    }
}