package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieLibraryTest {

    @Test
    public void shouldReturnContentsOfMovieLibrary() {
        MovieLibrary movieLibrary = new MovieLibrary();

        assertEquals("The Godfather\t1972\tFrancis Ford Cuppola\t10\nThe Departed\t2006\tMartin Scorsese\t9\n", movieLibrary.toString());
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