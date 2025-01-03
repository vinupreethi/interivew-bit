package org.ZomatoForReview.Strategy;

import org.ZomatoForReview.model.Restaurant;
import org.ZomatoForReview.model.ZomatoApp;

public class SearchByCuisine implements SearchStrategy {
    private ZomatoApp zomatoApp;

    public SearchByCuisine(ZomatoApp zomatoApp) {
        this.zomatoApp = zomatoApp;
    }

    @Override
    public Restaurant searchQuery(String query, String city) {
        return zomatoApp.getRestaurantcitylist().get(city).stream().filter(restaurant -> restaurant.getCuisines().contains(query)).findFirst().orElse(null);

    }
}
