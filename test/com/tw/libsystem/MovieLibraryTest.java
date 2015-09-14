package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieLibraryTest {

    @Test
    public void shouldReturnContentsOfMovieLibrary() {
        MovieLibrary movieLibrary = new MovieLibrary();

        assertEquals("The Godfather\t1972\tFrancis Ford Cuppola\t10\nThe Departed\t2006\tMartin Scorsese\t9\n", movieLibrary.toString());
    }
}