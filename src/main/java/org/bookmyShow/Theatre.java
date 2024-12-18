package org.bookmyShow;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Theatre {

    String theatreName;
    String city;
    List<Movie> movieList;
    List<Screen> screens;
    List<Show> shows;
    TicketBooking ticketBooking;


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

    public void setTicketBooking(TicketBooking ticketBooking) {
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


    public void bookTicket(String movieName,Theatre theatre) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Book Ticket Based on the availability of tickets..");
        System.out.println("2. Book Tickets based on the show..");
        System.out.println("3. Book Tickets based on the screen..");
        int options = scanner.nextInt();
        switch (options)
        {
            case 1:
                System.out.println("Enter the screenName where you want to watch: ");
                List<Screen> screen=theatre.getScreens();
                ticketBooking.bookTicketBasedonScreen(movieName,theatre,screen.get(0).screenName);
                break;
            case 2:
                List<Show> shows=theatre.getShows();
                Show show=shows.get(0);
                ticketBooking.bookTicketBasedonShow(movieName,theatre,show);
                break;
            default:
                break;
        }
    }


}
