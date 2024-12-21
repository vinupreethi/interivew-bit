package org.bookmyShow;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMyShowApp {
    List<User> userList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void registerUser() {
        System.out.println("Enter the username: ");
        String username = scanner.next();
        System.out.println("Enter password: ");
        String password = scanner.next();
        User user = new User(username, password);
        if (saveToDb(user)) {
            System.out.println("UserName already exists..! Try with different username..");
            userList.add(user);
        } else
            System.out.println("User registered successfully..");

    }

    private boolean saveToDb(User user) {
        return userList.stream().anyMatch(currentUser -> currentUser.username.equals(user.username));

    }

    public void loginUser() {
        System.out.println("Enter username: ");
        String username = scanner.next();
        System.out.println("Enter password: ");
        String password = scanner.next();
        if (authenticateUser(username, password)) {
            User user = new User(username, password);
            System.out.println("User logged in successfully");
            System.out.println("1. Search and book ticket for a movie..!");
            System.out.println("2. Cancel ticket..!");
            System.out.println("3. List the tickets..!");
            int options = scanner.nextInt();
            switch (options) {
                case 1:
                    searchAndBookTicket(user);
                    break;
                case 2:
                    cancelTicket(user, user.getTicket());
                    break;
                case 3:
                    listAllTicketsDetails(user);
            }
        } else {
            System.out.println("Invalid Credentials");
        }

    }

    private void listAllTicketsDetails(User user) {
        System.out.println(user.getTicket());
        System.out.println("Ticket Details: ");
        System.out.println("Ticket Id: ");
        System.out.println(user.getTicket().getTicketId());
        System.out.println("Movie Name:");
        System.out.println(user.getTicket().getMovie());
        System.out.println("Screen Name:");
        System.out.println(user.getTicket().getScreen());
        System.out.println("Seat No:");
        System.out.println(user.getTicket().getSeat().seatNo);
        System.out.println(user.getTicket().getSeat().seatRow);

    }

    private boolean authenticateUser(String name, String password) {
        return userList.stream().anyMatch(user -> user.username.equals(name) && user.password.equals(password));
    }


    public void searchAndBookTicket(User user) {
        user.searchAndBookMovie();
    }

    public void cancelTicket(User user, Ticket ticket) {
        user.cancelTicket(user, ticket);
    }


    public Ticket generateTicket(Screen screen, Show show, Seat seat) {
        Ticket ticket = new Ticket(1, show.movie, screen, show, seat);
        return ticket;
    }
}
