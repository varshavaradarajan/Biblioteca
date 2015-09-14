//Job of this class is to hold a list of pre existing movies so that one can borrow a movie from the list of movies available.
package com.tw.libsystem;

import java.util.ArrayList;

public class MovieLibrary {

    private ArrayList<Movie> movies;

    public MovieLibrary() {
        movies = new ArrayList<>();
        movies.add(new Movie("The Godfather", 1972, "Francis Ford Cuppola", "10"));
        movies.add(new Movie("The Departed", 2006, "Martin Scorsese", "9"));
    }

    @Override
    public String toString() {
        String details = "Movie\tYear\tDirector\tRating\n";
        for(Movie movie : movies) {
            details += movie.toString();
        }
        return details;
    }
}
