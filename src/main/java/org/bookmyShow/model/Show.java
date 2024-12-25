package org.bookmyShow.model;

import org.bookmyShow.constants.ShowTime;

public class Show {

    ShowTime showTime;
    int showDuration;
    int showStartTime;
    Movie movie;
    int movieCost;

    public int getMovieCost() {
        return movieCost;
    }

    public void setMovieCost(int movieCost) {
        this.movieCost = movieCost;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getShowStartTime() {
        return showStartTime;
    }

    public void setShowStartTime(int showStartTime) {
        this.showStartTime = showStartTime;
    }

    public ShowTime getShowTime() {
        return showTime;
    }

    public void setShowTime(ShowTime showTime) {
        this.showTime = showTime;
    }

    public int getShowDuration() {
        return showDuration;
    }

    public void setShowDuration(int showDuration) {
        this.showDuration = showDuration;
    }


}
