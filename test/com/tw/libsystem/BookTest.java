package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void shouldReturnAuthorNameWithBookName() {
        Book book = new Book("Angels And Demons", "Dan Brown");

        assertEquals("Angels And Demons\tDan Brown\t", book.toString());
    }
}