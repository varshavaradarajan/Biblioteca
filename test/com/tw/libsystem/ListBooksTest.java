package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ListBooksTest {

    @Test
    public void shouldReturnAPreExistingSetOfBooks() {
        Library library = new Library();
        ListBooks bookList = new ListBooks(library);

        assertEquals("Book Name\t\t\t\tAuthor Name\t\t\t\tYear\t\t\t\t\nCrime And Punishment\tFyodor Dostoevsky\t1866\t\nWuthering Heights\tEmily Bronte\t1847\t\nPragmatic Programmer\tDave Thomas\t1999\t\n", bookList.execute());
    }

    @Test
    public void shouldReturnBookDetailsWithColumnHeaders() {
        Library library = new Library();
        ListBooks bookList = new ListBooks(library);

        assertEquals("Book Name\t\t\t\tAuthor Name\t\t\t\tYear\t\t\t\t\nCrime And Punishment\tFyodor Dostoevsky\t1866\t\nWuthering Heights\tEmily Bronte\t1847\t\nPragmatic Programmer\tDave Thomas\t1999\t\n", bookList.execute());
    }

    @Test
    public void shouldReturnAllBookDetailsUponCallingExecuteMethod() {
        Library library = new Library();
        ListBooks bookList = new ListBooks(library);

        assertEquals("Book Name\t\t\t\tAuthor Name\t\t\t\tYear\t\t\t\t\nCrime And Punishment\tFyodor Dostoevsky\t1866\t\nWuthering Heights\tEmily Bronte\t1847\t\nPragmatic Programmer\tDave Thomas\t1999\t\n", bookList.execute());
    }
}