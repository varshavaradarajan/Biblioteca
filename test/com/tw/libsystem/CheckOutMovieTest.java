package com.tw.libsystem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class CheckOutMovieTest {

    private final ByteArrayInputStream inputStream = new ByteArrayInputStream("The Departed".getBytes());

    @Before
    public void setUpStream() {
        System.setIn(inputStream);
    }

    @After
    public void cleanUpStream() {
        System.setIn(System.in);
    }


    @Test
    public void shouldReturnAMessageOnCheckingOutABook() {
        MovieLibrary movieLibrary = new MovieLibrary();
        CheckOutMovie checkOutMovie = new CheckOutMovie(movieLibrary);

        assertEquals("Thank You! Enjoy the movie.\n", checkOutMovie.execute());
    }

    @Test
    public void shouldReturnAppropriateCheckOutMessageOnCheckingOutABook() {
        MovieLibrary movieLibrary = new MovieLibrary();
        CheckOutMovie checkOutMovie = new CheckOutMovie(movieLibrary);

        assertEquals("Thank You! Enjoy the movie.\n", checkOutMovie.execute());
    }

}