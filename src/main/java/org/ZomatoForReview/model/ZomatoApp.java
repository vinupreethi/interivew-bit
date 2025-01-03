package org.ZomatoForReview.model;

import org.ZomatoForReview.Observer.Observer;
import org.ZomatoForReview.Observer.Subject;
import org.ZomatoForReview.Strategy.SearchContext;
import org.ZomatoForReview.Strategy.SearchStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ZomatoApp implements SearchContext, Subject {

    public static volatile ZomatoApp zomatoApp;
    private SearchStrategy searchStrategy;
    private Observer observer;
    private Map<String, List<Restaurant>> restaurantcitylist = new HashMap<>();
    private List<User> zomatoUsers = new ArrayList<>();
    private List<User> activeUsers = new ArrayList<>();
    private HashMap<User, List<Review>> userReview = new HashMap<>();

    private ZomatoApp() {

    }

    public static ZomatoApp getInstance() {
        if (zomatoApp == null) {
            synchronized (ZomatoApp.class) {
                if(zomatoApp==null) {
                    return new ZomatoApp();
                }
            }
        }
        return zomatoApp;
    }


    public SearchStrategy getSearchStrategy() {
        return searchStrategy;
    }

    public void setSearchStrategy(SearchStrategy searchStrategy) {
        this.searchStrategy = searchStrategy;
    }

    public Observer getObserver() {
        return observer;
    }

    public void setObserver(Observer observer) {
        this.observer = observer;
    }

    public Map<String, List<Restaurant>> getRestaurantcitylist() {
        return restaurantcitylist;
    }

    public void setRestaurantcitylist(Map<String, List<Restaurant>> restaurantcitylist) {
        this.restaurantcitylist = restaurantcitylist;
    }


    public HashMap<User, List<Review>> getUserReview() {
        return userReview;
    }

    public void setUserReview(HashMap<User, List<Review>> userReview) {
        this.userReview = userReview;
    }

    public List<User> getActiveUsers() {
        return activeUsers;
    }

    public void setActiveUsers(List<User> activeUsers) {
        this.activeUsers = activeUsers;
    }

    public List<User> getZomatoUsers() {
        return zomatoUsers;
    }

    public void setZomatoUsers(List<User> zomatoUsers) {
        this.zomatoUsers = zomatoUsers;
    }

    public void saveUserinDb(User user) {
        zomatoUsers.add(user);
    }

    public boolean validateCredentials(User user) {
        return zomatoUsers.contains(user);
    }

    public void addActiveUser(User user) {
        activeUsers.add(user);
    }


    @Override
    public Restaurant searchQuery(String query, String location) {
        Restaurant restaurant = searchStrategy.searchQuery(query, location);
        return restaurant;
    }

    public void submitReview(String reviewComments, int rating, User user, Restaurant restaurant) {
        Review review = new Review(user, rating, reviewComments);
        restaurant.setReviewList(restaurant.getReviewList().stream().filter(existing -> !existing.equals(review)).collect(Collectors.toList()));
        notifyUser("reivew comment submitted");
    }

    public void editReview(String newReviewComment, User user1, Restaurant restaurant) {
        restaurant.getReviewList().stream().filter(review -> review.getUser().equals(user1)).forEach(review -> review.setReviewComments(newReviewComment));
        notifyUser("comment edited");
    }

    public void deleteReview(User user, Restaurant restaurant) {
        restaurant.setReviewList(restaurant.getReviewList().stream().filter(review -> !review.getUser().equals(user)).collect(Collectors.toList()));
        notifyUser("comment deleted");
    }

    @Override
    public void notifyUser(String message) {
        observer.update(message);
    }
}
