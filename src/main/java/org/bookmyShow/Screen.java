package org.bookmyShow;

import java.util.List;

public class Screen {
    User user;
    String screenName;
    List<Show> movieShows;
    List<Seat> noOfSeats;


    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public List<Show> getMovieShows() {
        return movieShows;
    }

    public void setMovieShow(List<Show> movieShow) {
        this.movieShows = movieShow;
    }

    public List<Seat> getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(List<Seat> noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public Seat checkSeatAvailability(Screen screen, Show show) {
        List<Seat> seatList = screen.getNoOfSeats();
        for (Seat seat : seatList) {
            if (seat.getSeatType() == SeatType.AVAILABLE) {
                return seat;
            }
        }
        return null;
    }


}
