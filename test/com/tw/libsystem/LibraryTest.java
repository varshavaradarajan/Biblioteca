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
        String columns = String.format("%-25s %-25s %s \n", "Bookname", "Author Name", "Year");
        assertEquals(columns + String.format("%-25s %-25s %s\n", "Crime And Punishment", "Fyodor Dostoevsky", "1866") + String.format("%-25s %-25s %s\n", "Wuthering Heights", "Emily Bronte", "1847") + String.format("%-25s %-25s %s\n", "Pragmatic Programmer", "Dave Thomas", "1999"), library.toString());
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
        Book book = new Book("Wuthering Heights", "Emily Bronte", 1847);
        library.removeBook(book);

        assertEquals("Thank you for returning the book.\n", library.returnBook(book));
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

        assertEquals("That is not a valid book to return.\n", library.returnBook(book));
    }

    @Test
    public void shouldReturnANotValidMessageIfTheBookSpecifiedIsNotInCheckedOutBookList() {
        Library library = new Library();
        Book book = new Book("Fire", "Emily Bronte", 1847);

        assertEquals("That is not a valid book to return.\n", library.returnBook(book));
    }

}