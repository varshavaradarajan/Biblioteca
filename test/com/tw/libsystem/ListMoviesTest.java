package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ListMoviesTest {

    @Test
    public void shouldReturnPreExistingSetOfMovies() {
        MovieLibrary movieLibrary = new MovieLibrary();
        ListMovies listMovies = new ListMovies(movieLibrary);

        assertEquals("Movie\tYear\tDirector\tRating\nThe Godfather\t1972\tFrancis Ford Cuppola\t10\n" +
                "The Departed\t2006\tMartin Scorsese\t9\n", listMovies.execute());
    }

    @Test
    public void shouldReturnPreExistingSetOfMoviesWithColumnHeaders() {
        MovieLibrary movieLibrary = new MovieLibrary();
        ListMovies listMovies = new ListMovies(movieLibrary);

        assertEquals("Movie\tYear\tDirector\tRating\nThe Godfather\t1972\tFrancis Ford Cuppola\t10\n" +
                "The Departed\t2006\tMartin Scorsese\t9\n", listMovies.execute());
    }

}