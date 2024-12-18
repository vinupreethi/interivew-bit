package org.bookmyShow;

import java.util.List;

public class Ticket {
    int ticketId;
    Movie movie;
    Screen screen;
    Show show;
    Seat seat;

    public Ticket(int ticketId, Movie movie, Screen screen, Show show, Seat seat) {
        this.ticketId = ticketId;
        this.movie = movie;
        this.screen = screen;
        this.show = show;
        this.seat = seat;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }


}
