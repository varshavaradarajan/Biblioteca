package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ListMoviesTest {

    @Test
    public void shouldReturnPreExistingSetOfMovies() {
        MovieLibrary movieLibrary = new MovieLibrary();
        ListMovies listMovies = new ListMovies(movieLibrary);
        String columns = String.format("%-25s %-25s %-25s %-25s \n", "Movie", "Year", "Director", "Rating");

        assertEquals(columns + String.format("%-25s %-25s %-25s %-25s\n", "The Godfather", "1972", "Francis Ford Cuppola", "10")
                + String.format("%-25s %-25s %-25s %-25s\n", "The Departed", "2006", "Martin Scorsese", "9"), listMovies.execute());
    }

    @Test
    public void shouldReturnPreExistingSetOfMoviesWithColumnHeaders() {
        MovieLibrary movieLibrary = new MovieLibrary();
        ListMovies listMovies = new ListMovies(movieLibrary);
        String columns = String.format("%-25s %-25s %-25s %-25s \n", "Movie", "Year", "Director", "Rating");

        assertEquals(columns + String.format("%-25s %-25s %-25s %-25s\n", "The Godfather", "1972", "Francis Ford Cuppola", "10")
                + String.format("%-25s %-25s %-25s %-25s\n", "The Departed", "2006", "Martin Scorsese", "9"), listMovies.execute());
    }

}