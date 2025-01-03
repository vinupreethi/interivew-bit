package org.ZomatoForReview.model;

import java.util.List;

public class Restaurant {
    private String name;
    private List<String> cuisines;
    private String city;
    private String location;
    private List<Review> review;


    public List<Review> getReviewList() {
        return review;
    }

    public void setReviewList(List<Review> review) {
        this.review = review;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Restaurant(String name, List<String> cuisines, String city, String location)

    {
        this.name = name;
        this.cuisines = cuisines;
        this.city = city;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCuisines() {
        return cuisines;
    }

    public void setCuisines(List<String> cuisines) {
        this.cuisines = cuisines;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
