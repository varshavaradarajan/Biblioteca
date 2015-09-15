package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckOutMovieTest {

    @Test
    public void shouldReturnAMessageOnCheckingOutABook() {
        MovieLibrary movieLibrary = new MovieLibrary();
        CheckOutMovie checkOutMovie = new CheckOutMovie(movieLibrary);

        assertEquals("Thank You! Enjoy the movie.\n", checkOutMovie.execute());
    }


}