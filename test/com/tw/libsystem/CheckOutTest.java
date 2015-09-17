package com.tw.libsystem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CheckOutTest {

    private final ByteArrayInputStream inputStream = new ByteArrayInputStream("Wuthering Heights".getBytes());

    @Before
    public void setUpStream() {
        System.setIn(inputStream);
    }

    @After
    public void cleanUpStream() {
        System.setIn(System.in);
    }

    @Test
    public void shouldReturnAMessageUponExecution() {
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        Authenticator authenticator = mock(Authenticator.class);
        OperationsFactory operationsFactory = mock(OperationsFactory.class);
        InputView inputView = mock(InputView.class);
        Book book = new Book("Wuthering Heights", "bar", 0);

        CheckOut checkOut = spy(new CheckOut(library, session, authenticator, operationsFactory, inputView));

        when(session.typeOfUser()).thenReturn("librarian");
        when(inputView.input()).thenReturn("Wuthering Heights");
        when(checkOut.createBook()).thenReturn(book);
        when(library.removeBook(book, session)).thenReturn("Thank You! Enjoy the book.\n");

        assertEquals("Thank You! Enjoy the book.\n", checkOut.execute());
    }

    @Test
    public void shouldReturnLoginMessageInInvalidCredentialsAreEnteredWhileLoggingIn() {
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        Authenticator authenticator = mock(Authenticator.class);
        OperationsFactory operationsFactory = mock(OperationsFactory.class);
        InputView inputView = mock(InputView.class);
        Login login = mock(Login.class);

        when(session.typeOfUser()).thenReturn("guest");
        when(operationsFactory.returnNewLoginObject(inputView, authenticator, session)).thenReturn(login);
        when(inputView.input()).thenReturn("abc-defg").thenReturn("qwerty");
        when(login.execute()).thenReturn("Invalid username/password.\n");

        CheckOut checkOut = new CheckOut(library, session, authenticator, operationsFactory, inputView);

        assertEquals("Invalid username/password.\n", checkOut.execute());
    }

    @Test
    public void shouldDelegateTheUserLoginToLoginOperation() {
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        InputView inputView = mock(InputView.class);
        Login login = mock(Login.class);
        Authenticator authenticator = mock(Authenticator.class);
        OperationsFactory operationsFactory = mock(OperationsFactory.class);
        when(session.typeOfUser()).thenReturn("guest");
        when(operationsFactory.returnNewLoginObject(inputView, authenticator, session)).thenReturn(login);
        CheckOut checkOut = new CheckOut(library, session, authenticator, operationsFactory, inputView);

        checkOut.delegateUserLoginToLoginOperation();

        verify(login, times(1)).execute();
    }
}