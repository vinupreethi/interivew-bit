package org.ZomatoForReview.Strategy;

import org.ZomatoForReview.model.Restaurant;

public interface SearchContext {
    Restaurant searchQuery(String query, String location);
}
