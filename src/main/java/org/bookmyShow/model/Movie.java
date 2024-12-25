package org.bookmyShow.model;


import org.bookmyShow.constants.Genre;

import java.util.List;

public class Movie {
    int movieId;
    String movieName;
    Double imdbMovieRating;
    List<String> castMembers;
    String language;
    Genre genre;
    List<Theatre> theatreList;

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public List<Theatre> getTheatreList() {
        return theatreList;
    }

    public void setTheatreList(List<Theatre> theatreList) {
        this.theatreList = theatreList;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Double getImdbMovieRating() {
        return imdbMovieRating;
    }

    public void setImdbMovieRating(Double imdbMovieRating) {
        this.imdbMovieRating = imdbMovieRating;
    }

    public List<String> getCastMembers() {
        return castMembers;
    }

    public void setCastMembers(List<String> castMembers) {
        this.castMembers = castMembers;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
