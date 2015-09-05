package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void shouldReturnTheBookName() {
        Book book = new Book("Angels And Demons");

        assertEquals("Angels And Demons\t", book.toString());
    }
}