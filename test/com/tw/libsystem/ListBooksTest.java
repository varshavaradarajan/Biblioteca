package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ListBooksTest {

    @Test
    public void shouldReturnAPreExistingSetOfBooks() {
        Library library = new Library();
        ListBooks bookList = new ListBooks(library);
        String columns = String.format("%-25s %-25s %s \n", "Bookname", "Author Name", "Year");

        assertEquals(columns + String.format("%-25s %-25s %s\n", "Crime And Punishment", "Fyodor Dostoevsky", "1866") + String.format("%-25s %-25s %s\n", "Wuthering Heights", "Emily Bronte", "1847") + String.format("%-25s %-25s %s\n", "Pragmatic Programmer", "Dave Thomas", "1999"), bookList.execute());
    }

    @Test
    public void shouldReturnBookDetailsWithColumnHeaders() {
        Library library = new Library();
        ListBooks bookList = new ListBooks(library);
        String columns = String.format("%-25s %-25s %s \n", "Bookname", "Author Name", "Year");

        assertEquals(columns + String.format("%-25s %-25s %s\n", "Crime And Punishment", "Fyodor Dostoevsky", "1866") + String.format("%-25s %-25s %s\n", "Wuthering Heights", "Emily Bronte", "1847") + String.format("%-25s %-25s %s\n", "Pragmatic Programmer", "Dave Thomas", "1999"), bookList.execute());
    }

    @Test
    public void shouldReturnAllBookDetailsUponCallingExecuteMethod() {
        Library library = new Library();
        ListBooks bookList = new ListBooks(library);
        String columns = String.format("%-25s %-25s %s \n", "Bookname", "Author Name", "Year");

        assertEquals(columns + String.format("%-25s %-25s %s\n", "Crime And Punishment", "Fyodor Dostoevsky", "1866") + String.format("%-25s %-25s %s\n", "Wuthering Heights", "Emily Bronte", "1847") + String.format("%-25s %-25s %s\n", "Pragmatic Programmer", "Dave Thomas", "1999"), bookList.execute());
    }
}