package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    @Test
    public void shouldReturnMovieDetails() {
        Movie movie = new Movie();

        assertEquals("The Departed\t2006\tMartin Scorsese\t9", movie.toString());
    }

}