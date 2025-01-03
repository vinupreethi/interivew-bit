package org.ZomatoForReview.Strategy;

import org.ZomatoForReview.model.Restaurant;

public interface SearchStrategy {
    Restaurant searchQuery(String query, String city);
}
