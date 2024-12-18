package org.bookmyShow;

import java.util.List;
import java.util.Scanner;

public class User {
    String username;
    String password;
    Search search;
    Ticket ticket;
    BookMyShowApp bookMyShowApp;
    int balance;
    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }


    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void searchAndBookMovie() {

        System.out.println("How do you want to Search the movies..?");
        System.out.println("1. Based on Movie name..");
        System.out.println("2. Based on Genre.");
        System.out.println("3. Search theatres based on location..");
        Scanner scanner = new Scanner(System.in);
        int options = scanner.nextInt();
        switch (options) {
            case 1:
                System.out.println("Enter movie name: ");
                String movieName = scanner.next();
                List<Theatre> theatreListByMovieName = search.searchMoviesByName(movieName);
                System.out.println("Choose the theatre where you need to watch movie: ");
                String theatreName = scanner.next();
                Theatre chosenTheatre = search.searchTheatre(theatreName, theatreListByMovieName);
                chosenTheatre.bookTicket(movieName, chosenTheatre);
                break;
            case 2:
                System.out.println("Enter the genre which you are interested: ");
                Genre genre = Genre.valueOf(scanner.next());
                List<Movie> movieListByGenre = search.searchMoviesByGenre(genre);
                System.out.println("Choose the movie which you need to watch: ");
                String movieName1 = scanner.next();
                if (movieListByGenre.contains(movieName1)) {
                    Theatre chosenTheatre1 = search.findTheatreforThatMovie(movieName1, movieListByGenre);
                    chosenTheatre1.bookTicket(movieName1, chosenTheatre1);
                } else {
                    System.out.println("Movie of that genre is is not present..!");
                }
                break;
            case 3:
                System.out.println("List Movies based on location: ");
                String city = scanner.next();
                List<Theatre> theatrelist = search.searchTheatersByCity(city);
                System.out.println("Enter the theatre where you need to watch: ");
                String theatreName1 = scanner.next();
                Theatre chosenTheatre1 = search.searchTheatre(theatreName1, theatrelist);
                System.out.println("Choose the movie which you need to watch: ");
                String movieName2 = scanner.next();
                chosenTheatre1.bookTicket(movieName2, chosenTheatre1);
                break;
            default:
                break;
        }


    }


    public void cancelTicket(User user, Ticket tickets) {
        Seat seat = tickets.getSeat();
        seat.setSeatType(SeatType.CANCELLED);


    }

    public void bookTicket(Screen screen, Show show, Seat seat) {
        if (isTransactionSuccessFull(show)) {
            seat.setSeatType(SeatType.BOOKED);
            Ticket ticket = bookMyShowApp.generateTicket(screen, show, seat);
            System.out.println("Payment is successful and Seat is booked.. !");
        } else {
            System.out.println("Ticket is not booked.. Refund wil be initiated to the wallet");
        }


    }

    private boolean isTransactionSuccessFull(Show show) {
        if(balance-show.movieCost<0)
        {
            return false;
        }
        balance=balance-show.movieCost;
        return true;
    }
}
