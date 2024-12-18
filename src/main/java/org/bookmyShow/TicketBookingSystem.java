package org.bookmyShow;

import java.util.ArrayList;
import java.util.List;

public class TicketBookingSystem implements TicketBooking {
    PaymentService payment;
    BookMyShowApp bookMyShowApp;
    User user;

    @Override
    public void bookTicketBasedonShow(String movieName, Theatre theatre, Show show) {
        List<Screen> screenList = theatre.getScreens();
        for (Screen screen : screenList) {
            if (screen.getMovieShows().contains(show)) {
                Seat seat = screen.checkSeatAvailability(screen, show);
                user.bookTicket(screen, show, seat);

            }
        }
    }


    @Override
    public void bookTicketBasedonScreen(String movieName, Theatre theatre, String screenName) {
        List<Screen> screenList = theatre.getScreens();
        for (Screen screen : screenList) {
            if (screen.getScreenName().contains(screenName)) {
                Show show = screen.getMovieShows().get(0);
                Seat seat = screen.checkSeatAvailability(screen, show);
                user.bookTicket(screen, show, seat);

            }
        }
    }

}
