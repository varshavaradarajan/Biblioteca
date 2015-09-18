package com.tw.libsystem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CheckOutMovieTest {

    @Test
    public void shouldReturnAMessageOnCheckingOutABook() {
        MovieLibrary movieLibrary = new MovieLibrary();
        Factory factory = mock(Factory.class);
        Display display = mock(Display.class);
        InputView inputView = mock(InputView.class);
        when(factory.buildDisplay("Enter Movie Name: ")).thenReturn(display);
        when(factory.buildInputView()).thenReturn(inputView);
        when(inputView.input()).thenReturn("The Departed");
        CheckOutMovie checkOutMovie = new CheckOutMovie(movieLibrary, factory);

        assertEquals("Thank You! Enjoy the movie.\n", checkOutMovie.execute());
    }

    @Test
    public void shouldReturnAppropriateCheckOutMessageOnCheckingOutABook() {
        MovieLibrary movieLibrary = new MovieLibrary();
        Factory factory = mock(Factory.class);
        Display display = mock(Display.class);
        InputView inputView = mock(InputView.class);
        when(factory.buildDisplay("Enter Movie Name: ")).thenReturn(display);
        when(factory.buildInputView()).thenReturn(inputView);
        when(inputView.input()).thenReturn("The Departeddd");

        CheckOutMovie checkOutMovie = new CheckOutMovie(movieLibrary, factory);

        assertEquals("That movie is not available.\n", checkOutMovie.execute());
    }

}