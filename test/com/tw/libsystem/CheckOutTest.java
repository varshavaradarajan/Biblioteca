package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckOutTest {

    @Test
    public void shouldReturnAMessageOnCheckingOutABook() {
        Library library = new Library();
        CheckOut checkOut = new CheckOut(library);

        assertEquals("Removed Book Successfully", checkOut.execute());
    }

    @Test
    public void shouldReturnACheckOutMessageOnCheckingOutAvailableBooks() {
        Library library = new Library();
        CheckOut checkOut = new CheckOut(library);

        assertEquals("Removed Book Successfully", checkOut.execute());
    }
}