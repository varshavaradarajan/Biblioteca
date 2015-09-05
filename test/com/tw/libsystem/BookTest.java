package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void shouldReturnBookDetails() {
        Book book = new Book("Angels And Demons", "Dan Brown", 2000);

        assertEquals("Angels And Demons\tDan Brown\t2000\t", book.toString());
    }
}