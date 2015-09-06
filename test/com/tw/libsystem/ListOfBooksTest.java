package com.tw.libsystem;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ListOfBooksTest {

    @Test
    public void shouldReturnAPreExistingSetOfBooks() {
        ArrayList<Book> listOfBooks = new ArrayList<Book>();
        listOfBooks.add(new Book("Crime And Punishment", "Fyodor Dostoevsky", 1866));
        listOfBooks.add(new Book("Wuthering Heights", "Emily Bronte", 1847));
        listOfBooks.add(new Book("Pragmatic Programmer", "Dave Thomas", 1999));

        ListOfBooks bookList = new ListOfBooks(listOfBooks);

        assertEquals("Book Name\t\t\t\tAuthor Name\t\t\t\tYear\t\t\t\t\nCrime And Punishment\tFyodor Dostoevsky\t1866\t\nWuthering Heights\tEmily Bronte\t1847\t\nPragmatic Programmer\tDave Thomas\t1999\t\n", bookList.toString());
    }

    @Test
    public void shouldReturnBookDetailsWithColumnHeaders() {
        ArrayList<Book> listOfBooks = new ArrayList<Book>();
        listOfBooks.add(new Book("Crime And Punishment", "Fyodor Dostoevsky", 1866));
        listOfBooks.add(new Book("Wuthering Heights", "Emily Bronte", 1847));
        listOfBooks.add(new Book("Pragmatic Programmer", "Dave Thomas", 1999));

        ListOfBooks bookList = new ListOfBooks(listOfBooks);
        assertEquals("Book Name\t\t\t\tAuthor Name\t\t\t\tYear\t\t\t\t\nCrime And Punishment\tFyodor Dostoevsky\t1866\t\nWuthering Heights\tEmily Bronte\t1847\t\nPragmatic Programmer\tDave Thomas\t1999\t\n", bookList.toString());
    }
}