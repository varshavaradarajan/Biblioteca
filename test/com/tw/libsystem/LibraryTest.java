package com.tw.libsystem;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class LibraryTest {

    @Test
    public void shouldReturnTheContentsOfLibrary() {
        Library library = new Library();

        assertEquals("Book Name\t\t\t\tAuthor Name\t\t\t\tYear\t\t\t\t\nCrime And Punishment\tFyodor Dostoevsky\t1866\t\nWuthering Heights\tEmily Bronte\t1847\t\nPragmatic Programmer\tDave Thomas\t1999\t\n", library.toString());
    }

    @Test
    public void shouldReturnTrueIfLibraryHasABook() {
        Library library = new Library();
        Book book = new Book("Wuthering Heights", "Emily Bronte", 1847);
        ArrayList<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book("Crime And Punishment", "Fyodor Dostoevsky", 1866));
        listOfBooks.add(new Book("Wuthering Heights", "Emily Bronte", 1847));
        listOfBooks.add(new Book("Pragmatic Programmer", "Dave Thomas", 1999));

        assertEquals(true, library.has(book, listOfBooks));
    }

    @Test
    public void shouldReturnTrueIfLibraryHasABookEqualToBookBeingSpecified() {
        Library library = new Library();
        Book book = new Book("Wuthering Heights", "Emily Bronte", 1847);
        ArrayList<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book("Crime And Punishment", "Fyodor Dostoevsky", 1866));
        listOfBooks.add(new Book("Wuthering Heights", "Emily Bronte", 1847));
        listOfBooks.add(new Book("Pragmatic Programmer", "Dave Thomas", 1999));

        assertEquals(true, library.has(book, listOfBooks));
    }

    @Test
    public void shouldReturnMessageIfBookIsRemoved() {
        Library library = new Library();
        Book book = new Book("Wuthering Heights", "Bar", 2015);

        assertEquals("Thank You!Enjoy the book.\n", library.removeBook(book));
    }

    @Test
    public void shouldReturnFalseWhenLibraryDoesNotHaveABookAfterWeRemoveItFromBookList() {
        Library library = new Library();
        Book book = new Book("Wuthering Heights", "Emily Bronte", 1847);
        ArrayList<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book("Crime And Punishment", "Fyodor Dostoevsky", 1866));
        listOfBooks.add(new Book("Pragmatic Programmer", "Dave Thomas", 1999));
        library.removeBook(book);

        assertEquals(false, library.has(book, listOfBooks));
    }

    @Test
    public void shouldReturnAnotherMessageIfBookIsNotRemoved() {
        Library library = new Library();
        Book book = new Book("Foo", "Bar", 2015);

        assertEquals("That book is not available.\n", library.removeBook(book));
    }

    @Test
    public void shouldAddCheckedOutBookToAnotherList() {
        Library library = new Library();
        Book book = new Book("Wuthering Heights", "Emily Bronte", 1847);

        assertEquals("Thank You!Enjoy the book.\n", library.removeBook(book));
    }

    @Test
    public void shouldReturnAMessageIfBookIsAdded() {
        Library library = new Library();
        Book book = new Book("Foo", "Bar", 2010);

        assertEquals("Not a valid book to return.\n", library.returnBook(book));
    }

    @Test
    public void shouldReturnFalseIfLibraryDoesNotHaveABookEqualToBookBeingSpecified() {
        Library library = new Library();
        Book book = new Book("Foo", "Emily Bronte", 1847);
        ArrayList<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book("Crime And Punishment", "Fyodor Dostoevsky", 1866));
        listOfBooks.add(new Book("Wuthering Heights", "Emily Bronte", 1847));
        listOfBooks.add(new Book("Pragmatic Programmer", "Dave Thomas", 1999));

        assertEquals(false, library.has(book, listOfBooks));
    }

    @Test
    public void shouldReturnAnotherMessageIfBookIsNotAdded() {
        Library library = new Library();
        Book book = new Book("Wuthering Heights", "Emily Bronte", 1847);

        assertEquals("Not a valid book to return.\n", library.returnBook(book));
    }

    @Test
    public void shouldReturnANotValidMessageIfTheBookSpecifiedIsNotInCheckedOutBookList() {
        Library library = new Library();
        Book book = new Book("Fire", "Emily Bronte", 1847);

        assertEquals("Not a valid book to return.\n", library.returnBook(book));
    }

}