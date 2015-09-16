package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class ParserTest {

    @Test
    public void shouldReturnInvalidCommandIfInputIsEmpty() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Session session = mock(Session.class);
        OperationsFactory operationsFactory = new OperationsFactory();
        Factory factory = mock(Factory.class);
        Authenticator authenticator = mock(Authenticator.class);
        Parser parser = new Parser("", library, movieLibrary, session, operationsFactory, authenticator, factory);
        InvalidCommand invalidCommand = new InvalidCommand();

        assertEquals(invalidCommand.getClass(), parser.parse().getClass());
    }

    @Test
    public void shouldReturnInvalidIfInputLengthIsMoreThanOne() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Session session = mock(Session.class);
        OperationsFactory operationsFactory = new OperationsFactory();
        Factory factory = mock(Factory.class);
        Authenticator authenticator = mock(Authenticator.class);
        Parser parser = new Parser("1 2", library, movieLibrary, session, operationsFactory, authenticator, factory);
        InvalidCommand invalidCommand = new InvalidCommand();

        assertEquals(invalidCommand.getClass(), parser.parse().getClass());
    }

    @Test
    public void shouldReturnAnOperationOnParsingTheInput() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Session session = mock(Session.class);
        OperationsFactory operationsFactory = new OperationsFactory();
        Factory factory = mock(Factory.class);
        Authenticator authenticator = mock(Authenticator.class);
        Parser parser = new Parser("1", library, movieLibrary, session, operationsFactory, authenticator, factory);
        ListBooks listBooks = new ListBooks(library);

        assertEquals(listBooks.getClass(), parser.parse().getClass());
    }

    @Test
    public void shouldReturnInvalidCommandAsOperationForInvalidInput() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Session session = mock(Session.class);
        OperationsFactory operationsFactory = new OperationsFactory();
        Factory factory = mock(Factory.class);
        Authenticator authenticator = mock(Authenticator.class);
        Parser parser = new Parser("a", library, movieLibrary, session, operationsFactory, authenticator, factory);
        InvalidCommand invalidCommand = new InvalidCommand();

        assertEquals(invalidCommand.getClass(), parser.parse().getClass());
    }

    @Test
    public void shouldReturnExitApplicationAsOperationOnParsingInputValue0() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Session session = mock(Session.class);
        OperationsFactory operationsFactory = new OperationsFactory();
        Factory factory = mock(Factory.class);
        Authenticator authenticator = mock(Authenticator.class);
        Parser parser = new Parser("0", library, movieLibrary, session, operationsFactory, authenticator, factory);
        ExitApplication exitApplication = new ExitApplication();

        assertEquals(exitApplication.getClass(), parser.parse().getClass());
    }

    @Test
    public void shouldReturnCheckOutAsOperationOnParsingInputValue2() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Session session = mock(Session.class);
        OperationsFactory operationsFactory = new OperationsFactory();
        Factory factory = mock(Factory.class);
        Authenticator authenticator = mock(Authenticator.class);
        InputView inputView = mock(InputView.class);
        Parser parser = new Parser("2", library, movieLibrary, session, operationsFactory, authenticator, factory);
        CheckOut checkOut = new CheckOut(library, session, authenticator, operationsFactory, inputView);

        assertEquals(checkOut.getClass(), parser.parse().getClass());
    }

    @Test
    public void shouldReturnCheckInAsOperationOnParsingInputValue3() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        InputView inputView = new InputView();
        Session session = mock(Session.class);
        OperationsFactory operationsFactory = new OperationsFactory();
        Factory factory = mock(Factory.class);
        Authenticator authenticator = mock(Authenticator.class);
        Parser parser = new Parser("3", library, movieLibrary, session, operationsFactory, authenticator, factory);
        CheckIn checkIn = new CheckIn(library, inputView);

        assertEquals(checkIn.getClass(), parser.parse().getClass());
    }

    @Test
    public void shouldReturnListMoviesAsOperationOnParsingInputValue4() {
        MovieLibrary movieLibrary = new MovieLibrary();
        Library library = new Library();
        Session session = mock(Session.class);
        OperationsFactory operationsFactory = new OperationsFactory();
        Factory factory = mock(Factory.class);
        Authenticator authenticator = mock(Authenticator.class);
        Parser parser = new Parser("4", library, movieLibrary, session, operationsFactory, authenticator, factory);

        assertEquals(ListMovies.class, parser.parse().getClass());
    }

    @Test
    public void shouldReturnCheckOutMoviesAsOperationOnParsingInputValue5() {
        MovieLibrary movieLibrary = new MovieLibrary();
        Library library = new Library();
        Session session = mock(Session.class);
        OperationsFactory operationsFactory = new OperationsFactory();
        Factory factory = mock(Factory.class);
        Authenticator authenticator = mock(Authenticator.class);
        Parser parser = new Parser("5", library, movieLibrary, session, operationsFactory, authenticator, factory);

        assertEquals(CheckOutMovie.class, parser.parse().getClass());
    }

    @Test
    public void shouldReturnLoginAsOperationOnParsingInputValue6() {
        MovieLibrary movieLibrary = new MovieLibrary();
        Library library = new Library();
        Session session = mock(Session.class);
        OperationsFactory operationsFactory = new OperationsFactory();
        Factory factory = mock(Factory.class);
        Authenticator authenticator = mock(Authenticator.class);
        Parser parser = new Parser("6", library, movieLibrary, session, operationsFactory, authenticator, factory);

        assertEquals(Login.class, parser.parse().getClass());
    }

}