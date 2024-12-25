package org.bookmyShow.service;


import org.bookmyShow.constants.Genre;
import org.bookmyShow.model.Movie;
import org.bookmyShow.model.Theatre;

import java.util.List;

public interface Search {
    List<Theatre> searchMoviesByName(String movieName);

    List<Movie> searchMoviesByGenre(Genre genre);

    List<Theatre> searchTheatersByCity(String city);

    Theatre searchTheatre(String theatre, List<Theatre> theatreList);

    Theatre findTheatreforThatMovie(String movieName1, List<Movie> movieListByGenre);
}
