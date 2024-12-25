package org.bookmyShow.service;


import org.bookmyShow.model.Show;
import org.bookmyShow.model.Theatre;
import org.bookmyShow.model.User;

public interface TicketBooking {

    void bookTicketBasedonShow(User user,String movieName, Theatre theatre, Show show);

    void bookTicketBasedonScreen(User user, String movieName, Theatre theatre, String screenName);


}
