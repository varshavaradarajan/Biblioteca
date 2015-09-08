package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {

    @Test
    public void shouldReturnBookDetails() {
        Book book = new Book("Angels And Demons", "Dan Brown", 2000);

        assertEquals("Angels And Demons\tDan Brown\t2000\t", book.toString());
    }

    @Test
    public void shouldReturnTrueIfBookExists() {
        Book book1 = new Book("Inferno", "Dan Brown", 2012);
        Book book2 = new Book("Angels And Demons", "Dan Brown", 2007);

        assertEquals(book1, book2);
    }

    @Test
    public void shouldReturnTrueIfObjectIsOfTheTypeBook() {
        Book book1 = new Book("Inferno", "Dan Brown", 2012);
        Book book2 = new Book("Angels And Demons", "Dan Brown", 2007);

        assertEquals(book1, book2);
    }
}