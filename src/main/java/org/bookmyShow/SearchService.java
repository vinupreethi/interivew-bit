package org.bookmyShow;

import java.util.List;


public class SearchService implements Search {
    Admin admin;

    @Override
    public List<Theatre> searchMoviesByName(String name) {
        return admin.getTheatreList().stream().filter(theatre -> theatre.city.equals(name)).toList();
    }

    @Override
    public List<Movie> searchMoviesByGenre(Genre genre) {
        return admin.getTheatreList().get(0).getMovieList().stream().filter(movie -> movie.genre.equals(genre)).toList();
    }

    @Override
    public List<Theatre> searchTheatersByCity(String city) {
        return admin.getTheatreList().stream().filter(theatre -> theatre.city.equals(city)).toList();
    }

    @Override
    public Theatre searchTheatre(String theatreName, List<Theatre> theatreList) {

        return theatreList.stream().filter(theatre1 -> theatre1.theatreName.equals(theatreName)).findFirst().orElse(null);
    }


    @Override
    public Theatre findTheatreforThatMovie(String movieName1, List<Movie> movieListByGenre) {
        List<Theatre> theatreList = admin.getTheatreList();
        for (Theatre theatre : theatreList) {
            List<Movie> movies = theatre.getMovieList();
            if (movies.contains(movieName1)) {
                return theatre;
            }
        }
        return null;
    }

}