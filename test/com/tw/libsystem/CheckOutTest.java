package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckOutTest {

    @Test
    public void shouldReturnAMessageOnCheckingOutABook() {
        CheckOut checkOut = new CheckOut();

        assertEquals("Successful Checkout", checkOut.execute());
    }
}