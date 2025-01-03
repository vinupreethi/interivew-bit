package org.ZomatoForReview.model;

import java.util.List;
import java.util.stream.Collectors;

public class Review {
    private int rating;
    private String reviewComments;
    private User user;

    public Review(User user, int rating, String reviewComments) {
        this.rating = rating;
        this.reviewComments = reviewComments;
        this.user = user;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReviewComments() {
        return reviewComments;
    }

    public void setReviewComments(String reviewComments) {
        this.reviewComments = reviewComments;
    }


}
