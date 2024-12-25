package org.bookmyShow.service;

import org.bookmyShow.model.Screen;
import org.bookmyShow.model.Show;
import org.bookmyShow.model.Theatre;
import org.bookmyShow.model.User;

import java.util.List;
import java.util.Scanner;

public class TheatreService {

    TicketBooking ticketBooking;
    public void bookTicket(User user, String movieName, Theatre theatre) {
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
                ticketBooking.bookTicketBasedonScreen(user,movieName,theatre,screen.get(0).getScreenName());
                break;
            case 2:
                List<Show> shows=theatre.getShows();
                Show show=shows.get(0);
                ticketBooking.bookTicketBasedonShow(user,movieName,theatre,show);
                break;
            default:
                break;
        }
    }
}
