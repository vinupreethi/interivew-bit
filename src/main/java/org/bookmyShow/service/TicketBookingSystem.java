package org.bookmyShow.service;

import org.bookmyShow.*;
import org.bookmyShow.model.*;

import java.util.List;

public class TicketBookingSystem implements TicketBooking {

    BookMyShowAppService bookMyShowApp;
    UserService userService;

    @Override
    public void bookTicketBasedonShow(User user,String movieName, Theatre theatre, Show show) {
        List<Screen> screenList = theatre.getScreens();
        for (Screen screen : screenList) {
            if (screen.getMovieShows().contains(show)) {
                Seat seat = screen.checkSeatAvailability(screen, show);
                userService.bookTicket(user,screen, show, seat);

            }
        }
    }


    @Override
    public void bookTicketBasedonScreen(User user,String movieName, Theatre theatre, String screenName) {
        List<Screen> screenList = theatre.getScreens();
        for (Screen screen : screenList) {
            if (screen.getScreenName().contains(screenName)) {
                Show show = screen.getMovieShows().get(0);
                Seat seat = screen.checkSeatAvailability(screen, show);
                userService.bookTicket(user,screen, show, seat);

            }
        }
    }

}
