package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieLibraryTest {

    @Test
    public void shouldReturnContentsOfMovieLibrary() {
        MovieLibrary movieLibrary = new MovieLibrary();
        String columns = String.format("%-25s %-25s %-25s %-25s \n", "Movie", "Year", "Director", "Rating");
        assertEquals(columns + String.format("%-25s %-25s %-25s %-25s\n", "The Godfather", "1972", "Francis Ford Cuppola", "10") + String.format("%-25s %-25s %-25s %-25s\n", "The Departed", "2006", "Martin Scorsese", "9"), movieLibrary.toString());
    }

    @Test
    public void shouldReturnAMessageWhenMovieIsRemovedFromTheMovieLibrary() {
        MovieLibrary movieLibrary = new MovieLibrary();
        Movie movie = new Movie("The Departed", 2006, "Martin Scorsese", "9");

        assertEquals("Thank You! Enjoy the movie.\n", movieLibrary.removeMovie(movie));
    }

    @Test
    public void shouldReturnADifferentMessageIfMovieIsNotRemoved() {
        MovieLibrary movieLibrary = new MovieLibrary();
        Movie movie = new Movie("The Departeddd", 2006, "Martin Scorsese", "9");

        assertEquals("That movie is not available.\n", movieLibrary.removeMovie(movie));
    }
}