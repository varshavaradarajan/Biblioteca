package com.tw.libsystem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class CheckOutTest {

    private final ByteArrayInputStream inputStream = new ByteArrayInputStream("Wuthering Heights".getBytes());

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
        Library library = new Library();
        CheckOut checkOut = new CheckOut(library);

        assertEquals("Thank You!Enjoy the book.", checkOut.execute());
    }

    @Test
    public void shouldReturnACheckOutMessageOnCheckingOutAvailableBooks() {
        Library library = new Library();
        CheckOut checkOut = new CheckOut(library);

        assertEquals("Thank You!Enjoy the book.", checkOut.execute());
    }
}