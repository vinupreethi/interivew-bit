package org.bookmyShow.model;


import org.bookmyShow.service.TicketBooking;
import org.bookmyShow.service.TicketBookingSystem;

import java.util.List;

public class Theatre {

    String theatreName;
    String city;
    List<Movie> movieList;
    List<Screen> screens;
    List<Show> shows;
    TicketBookingSystem ticketBooking;


    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    Theatre(String theatreName) {
        this.theatreName = theatreName;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public TicketBooking getTicketBooking() {
        return ticketBooking;
    }

    public void setTicketBooking(TicketBookingSystem ticketBooking) {
        this.ticketBooking = ticketBooking;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }





}
