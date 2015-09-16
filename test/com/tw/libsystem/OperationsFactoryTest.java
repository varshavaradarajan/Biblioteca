package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class OperationsFactoryTest {

    @Test
    public void shouldReturnNewListBooksObjects() {
        OperationsFactory operationsFactory = new OperationsFactory();
        Library library = mock(Library.class);


        assertEquals(ListBooks.class, operationsFactory.returnNewListBooksObject(library).getClass());
    }

    @Test
    public void shouldReturnNewListMoviesObjects() {
        OperationsFactory operationsFactory = new OperationsFactory();
        MovieLibrary movieLibrary = mock(MovieLibrary.class);


        assertEquals(ListMovies.class, operationsFactory.returnNewListMoviesObject(movieLibrary).getClass());
    }

    @Test
    public void shouldReturnNewCheckoutMoviesObjects() {
        OperationsFactory operationsFactory = new OperationsFactory();
        MovieLibrary movieLibrary = mock(MovieLibrary.class);

        assertEquals(CheckOutMovie.class, operationsFactory.returnNewCheckOutMoviesObject(movieLibrary).getClass());
    }

    @Test
    public void shouldReturnNewExitApplicationObjects() {
        OperationsFactory operationsFactory = new OperationsFactory();

        assertEquals(ExitApplication.class, operationsFactory.returnNewExitApplicationObject().getClass());
    }

    @Test
    public void shouldReturnInvalidOperationObjects() {
        OperationsFactory operationsFactory = new OperationsFactory();

        assertEquals(InvalidCommand.class, operationsFactory.returnNewInvalidCommandObject().getClass());
    }

    @Test
    public void shouldReturnNewLoginObjects() {
        OperationsFactory operationsFactory = new OperationsFactory();
        InputView inputView = mock(InputView.class);
        Authenticator authenticator = mock(Authenticator.class);
        Session session = mock(Session.class);

        assertEquals(Login.class, operationsFactory.returnNewLoginObject(inputView, authenticator, session).getClass());
    }

    @Test
    public void shouldReturnNewCheckOutObjects() {
        OperationsFactory operationsFactory = new OperationsFactory();
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        Authenticator authenticator = mock(Authenticator.class);
        InputView inputView = mock(InputView.class);

        assertEquals(CheckOut.class, operationsFactory.returnNewCheckOutObjects(library, session, authenticator, operationsFactory, inputView).getClass());
    }

    @Test
    public void shouldReturnNewCheckInObjects() {
        OperationsFactory operationsFactory = new OperationsFactory();
        Library library = mock(Library.class);
        InputView inputView = mock(InputView.class);

        assertEquals(CheckIn.class, operationsFactory.returnNewCheckInObject(library, inputView).getClass());
    }
}