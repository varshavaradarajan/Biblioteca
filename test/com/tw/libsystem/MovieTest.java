package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    @Test
    public void shouldReturnMovieDetails() {
        Movie movie = new Movie("The Departed", 2006, "Martin Scorsese", 9);

        assertEquals("The Departed\t2006\tMartin Scorsese\t9\n", movie.toString());
    }

    @Test
    public void shouldReturnDetailsOfAnyMovie() {
        Movie movie = new Movie("The Godfather", 1972, "Francis Ford Cuppola", 10);

        assertEquals("The Godfather\t1972\tFrancis Ford Cuppola\t10\n", movie.toString());
    }

}