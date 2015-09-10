package com.tw.libsystem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class CheckInTest {

    private final ByteArrayInputStream inputStream = new ByteArrayInputStream("Foo".getBytes());

    @Before
    public void setUpStream() {
        System.setIn(inputStream);
    }

    @After
    public void cleanUpStream() {
        System.setIn(System.in);
    }


    @Test
    public void shouldReturnAMessageWhenCheckInIsExecuted() {
        Library library = new Library();
        CheckIn checkIn = new CheckIn(library);

        assertEquals("Successfully Returned", checkIn.execute());
    }

    @Test
    public void shouldReturnACheckedInMessageAfterCheckingInABook() {
        Library library = new Library();
        CheckIn checkIn = new CheckIn(library);

        assertEquals("Successfully Returned", checkIn.execute());
    }

}