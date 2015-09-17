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
        Session session = mock(Session.class);

        assertEquals("Thank You!Enjoy the book.\n", library.removeBook(book, session));
    }

    @Test
    public void shouldReturnFalseWhenLibraryDoesNotHaveABookAfterWeRemoveItFromBookList() {
        Library library = new Library();
        Book book = new Book("Wuthering Heights", "Emily Bronte", 1847);
        Session session = mock(Session.class);
        ArrayList<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(new Book("Crime And Punishment", "Fyodor Dostoevsky", 1866));
        listOfBooks.add(new Book("Pragmatic Programmer", "Dave Thomas", 1999));
        library.removeBook(book, session);

        assertEquals(false, library.has(book, listOfBooks));
    }

    @Test
    public void shouldReturnAnotherMessageIfBookIsNotRemoved() {
        Library library = new Library();
        Book book = new Book("Foo", "Bar", 2015);
        Session session = mock(Session.class);

        assertEquals("That book is not available.\n", library.removeBook(book, session));
    }

    @Test
    public void shouldAddCheckedOutBookToAnotherList() {
        Library library = new Library();
        Book book = new Book("Wuthering Heights", "Emily Bronte", 1847);
        Session session = mock(Session.class);

        assertEquals("Thank You!Enjoy the book.\n", library.removeBook(book, session));
    }

    @Test
    public void shouldReturnAMessageIfBookIsAdded() {
        Library library = new Library();
        Book book = new Book("Wuthering Heights", "Emily Bronte", 1847);
        Session session = mock(Session.class);
        String details = String.format("%-25s %-25s %s\n", "Su", "su@gmail.com", "555-555-5555");
        when(session.currentUserDetails()).thenReturn(details);
        library.removeBook(book, session);
        when(session.currentUserDetails()).thenReturn(details);

        assertEquals("Thank you for returning the book.\n", library.returnBook(book, session));
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
        Book otherBook = new Book("Foo", "Emily Bronte", 2001);
        Session session = mock(Session.class);
        String details = String.format("%-25s %-25s %s\n", "Su", "su@gmail.com", "555-555-5555");
        when(session.currentUserDetails()).thenReturn(details);
        library.removeBook(book, session);
        when(session.currentUserDetails()).thenReturn(details);

        assertEquals("That is not a valid book to return.\n", library.returnBook(otherBook, session));
    }

    @Test
    public void shouldReturnANotValidMessageIfTheBookSpecifiedIsNotInCheckedOutBookList() {
        Library library = new Library();
        Book book = new Book("Wuthering Heights", "Emily Bronte", 1847);
        Book otherBook = new Book("Crime And Punishment", "Emily Bronte", 2001);
        Session session = mock(Session.class);
        String details = String.format("%-25s %-25s %s\n", "Su", "su@gmail.com", "555-555-5555");
        when(session.currentUserDetails()).thenReturn(details);
        library.removeBook(book, session);
        when(session.currentUserDetails()).thenReturn(details);

        assertEquals("That is not a valid book to return.\n", library.returnBook(otherBook, session));
    }

    @Test
    public void shouldRecordTheCurrentUserDetailsOnceBookIsRemoved() {
        Library library = new Library();
        Book book = new Book("Wuthering Heights", "Emily Bronte", 1847);
        String details = String.format("%-25s %-25s %s\n", "Su", "su@gmail.com", "555-555-5555");
        Session session = mock(Session.class);
        when(session.currentUserDetails()).thenReturn(details);

        assertEquals("Thank You!Enjoy the book.\n", library.removeBook(book, session));
    }

    @Test
    public void shouldAllowAParticularUserToReturnAParticularBook() {
        Library library = new Library();
        Session session = mock(Session.class);
        Book book = new Book("Wuthering Heights", "Emily Bronte", 1847);
        String details = String.format("%-25s %-25s %s\n", "Su", "su@gmail.com", "555-555-5555");
        when(session.currentUserDetails()).thenReturn(details);
        library.removeBook(book, session);
        when(session.currentUserDetails()).thenReturn(details);

        assertEquals("Thank you for returning the book.\n", library.returnBook(book, session));
    }

    @Test
    public void shouldNotAllowAnotherUserToReturnAParticularBook() {
        Library library = new Library();
        Session session = mock(Session.class);
        Book book = new Book("Wuthering Heights", "Emily Bronte", 1847);
        String details = String.format("%-25s %-25s %s\n", "Su", "su@gmail.com", "555-555-5555");
        String otherDetails = String.format("%-25s %-25s %s\n", "Al", "su@gmail.com", "555-555-5555");
        when(session.currentUserDetails()).thenReturn(details);
        library.removeBook(book, session);
        when(session.currentUserDetails()).thenReturn(otherDetails);

        assertEquals("That is not a valid book to be returned by you.\n", library.returnBook(book, session));
    }

}