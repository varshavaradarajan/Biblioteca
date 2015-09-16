package com.tw.libsystem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

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
        Session session = mock(Session.class);
        when(session.typeOfUser()).thenReturn("librarian");
        CheckOut checkOut = new CheckOut(library, session);

        assertEquals("Thank You!Enjoy the book.\n", checkOut.execute());
    }

    @Test
    public void shouldReturnACheckOutMessageOnCheckingOutAvailableBooks() {
        Library library = new Library();
        Session session = mock(Session.class);
        when(session.typeOfUser()).thenReturn("librarian");
        CheckOut checkOut = new CheckOut(library, session);

        assertEquals("Thank You!Enjoy the book.\n", checkOut.execute());
    }
}