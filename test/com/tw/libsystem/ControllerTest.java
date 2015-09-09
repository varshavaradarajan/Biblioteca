package com.tw.libsystem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class ControllerTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final ByteArrayInputStream inputStream = new ByteArrayInputStream("1".getBytes());

    @Before
    public void setStreams() {
        System.setOut(new PrintStream(outputStream));
        System.setIn(inputStream);
    }

    @Test
    public void shouldDelegateDisplayingMessageToDisplayClass() {
        Factory factory = new Factory();
        Library library = new Library();
        Controller controller = new Controller(factory, library);
        controller.delegateWelcomeMessageToBeDisplayed();

        assertEquals("Welcome to Biblioteca\n", outputStream.toString());
    }

    @Test
    public void shouldDisplayAMessageAfterAnOperationIsExecuted() {
        Factory factory = new Factory();
        Library library = new Library();
        Controller controller = new Controller(factory, library);
        CheckOut checkOut = new CheckOut(library);
        String output = checkOut.execute();
        controller.delegateDisplayingOfOutputMessages();


        assertEquals("That book is not available.", output);
    }

    @Test
    public void shouldDisplayAMessageAfterListBookOperationIsExecuted() {
        Factory factory = new Factory();
        Library library = new Library();
        Controller controller = new Controller(factory, library);
        ListBooks listBooks = new ListBooks(library);
        String output = listBooks.execute();
        controller.delegateDisplayingOfOutputMessages();


        assertEquals("Book Name\t\t\t\tAuthor Name\t\t\t\tYear\t\t\t\t\n" +
                "Crime And Punishment\tFyodor Dostoevsky\t1866\t\n" +
                "Wuthering Heights\tEmily Bronte\t1847\t\n" +
                "Pragmatic Programmer\tDave Thomas\t1999\t\n", output);
    }

    @Test
    public void shouldDelegateDisplayingOfMenuToDisplayClass() {
        Factory factory = new Factory();
        Library library = new Library();
        Controller controller = new Controller(factory, library);
        controller.delegateMenuToBeDisplayed();

        assertEquals("1. List Books\n2. Checkout\n3. Exit\n", outputStream.toString());
    }

    @Test
    public void shouldDelegateBuildingParserToFactory() {
        Library library = new Library();
        Factory factory = mock(Factory.class);
        Parser parser = mock(Parser.class);
        when(factory.buildParser("1", library)).thenReturn(parser);
    }

    @After
    public void clearStreams() {
        System.setOut(System.out);
        System.setIn(System.in);
    }

}