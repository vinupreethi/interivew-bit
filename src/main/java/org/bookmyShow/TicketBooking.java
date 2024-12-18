package org.bookmyShow;

interface TicketBooking {

    void bookTicketBasedonShow(String movieName, Theatre theatre, Show show);

    void bookTicketBasedonScreen(String movieName, Theatre theatre, String screenName);


}
