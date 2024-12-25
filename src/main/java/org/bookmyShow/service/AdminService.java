package org.bookmyShow.service;

import org.bookmyShow.model.*;

import java.util.ArrayList;
import java.util.List;

public class AdminService {
    Admin admin;


    public void addMoviesInTheatre(Movie movie) {
        boolean isMovieAdded = false;
        List<Theatre> theatreList=admin.getTheatreList();
        for (Theatre theatre : theatreList) {
            if (!theatre.getMovieList().contains(movie)) {
                theatre.getMovieList().add(movie);
                isMovieAdded = true;
            }
        }
        if (isMovieAdded) {
            System.out.println("Movie added to theatre(s).");
        } else {
            System.out.println("Movie is already being added in Theatre..!");
        }
    }


    public void removeMoviesInTheatre(Movie movie) {
        boolean isMovieRemoved = false;
        List<Theatre> theatreList=admin.getTheatreList();
        for (Theatre theatre : theatreList) {
            if (theatre.getMovieList().contains(movie)) {
                theatre.getMovieList().remove(movie);
                isMovieRemoved = true;
            }
        }
        if (isMovieRemoved) {
            System.out.println("Movie removed from theatre(s).");
        } else {
            System.out.println("Movie not found in any theatre.");
        }
    }

    public void addShowInTheatre(Show show) {
        List<Show> listOfShows = new ArrayList<>();
        List<Theatre> theatreList=admin.getTheatreList();
        for (Theatre theatre : theatreList) {
            List<Screen> screenList = theatre.getScreens();
            for (Screen screen : screenList) {
                listOfShows = screen.getMovieShows();
            }
        }
        if (checkIfShowTimeisOverlapping(show, listOfShows)) {
            System.out.println("Movie Show cannot be added..!");
        } else {
            listOfShows.add(show);
        }


    }

    private boolean checkIfShowTimeisOverlapping(Show show, List<Show> showList) {
        int startTime = show.getShowStartTime();
        int endTime = show.getShowStartTime() + show.getShowDuration();

        for (Show shows : showList) {
            int startTimeshow = shows.getShowStartTime();
            int endTimeshow = shows.getShowDuration() + shows.getShowStartTime();
            if ((startTimeshow > endTimeshow && endTimeshow < endTime) || (startTimeshow > startTime && startTimeshow < startTime)) {
                return true;
            }
        }
        return false;


    }


    public void removeShowInTheatre(Show show) {
        List<Show> listOfShows = new ArrayList<>();
        List<Theatre> theatreList=admin.getTheatreList();
        for (Theatre theatre : theatreList) {
            List<Screen> screenList = theatre.getScreens();
            for (Screen screen : screenList) {
                if (screen.getMovieShows().contains(show)) {
                    listOfShows = screen.getMovieShows();
                    listOfShows.remove(show);
                } else
                    System.out.println("Show is not present..!");
            }
        }

    }
}
