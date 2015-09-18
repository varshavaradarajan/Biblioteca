package com.tw.libsystem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CheckInTest {

    private final ByteArrayInputStream inputStream = new ByteArrayInputStream("Foo".getBytes());

    @Before
    public void setUpStream() {
        System.setIn(inputStream);
    }

    @After
    public void cleanUpStream() {
        System.setIn(System.in);
    }

    @Test
    public void shouldReturnLoginMessageInInvalidCredentialsAreEnteredWhileLoggingIn() {
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        Authenticator authenticator = mock(Authenticator.class);
        OperationsFactory operationsFactory = mock(OperationsFactory.class);
        Factory factory = mock(Factory.class);
        InputView inputView = mock(InputView.class);
        Login login = mock(Login.class);

        when(session.typeOfUser()).thenReturn("guest");
        when(operationsFactory.returnNewLoginObject(inputView, authenticator, session, factory)).thenReturn(login);
        when(inputView.input()).thenReturn("abc-defg").thenReturn("qwerty");
        when(login.execute()).thenReturn("Invalid username/password.\n");

        CheckIn checkIn = new CheckIn(library, session, authenticator, operationsFactory, inputView, factory);

        assertEquals("Invalid username/password.\n", checkIn.execute());
    }

    @Test
    public void shouldReturnACheckInMessageUponExecution() {
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        Authenticator authenticator = mock(Authenticator.class);
        OperationsFactory operationsFactory = mock(OperationsFactory.class);
        Factory factory = mock(Factory.class);
        InputView inputView = mock(InputView.class);
        Book book = new Book("Wuthering Heights", "bar", 0);

        CheckIn checkIn = spy(new CheckIn(library, session, authenticator, operationsFactory, inputView, factory));

        when(session.typeOfUser()).thenReturn("librarian");
        when(inputView.input()).thenReturn("Wuthering Heights");
        when(checkIn.createBook()).thenReturn(book);
        when(library.returnBook(book, session)).thenReturn("Thank you for returning the book.\n");

        assertEquals("Thank you for returning the book.\n", checkIn.execute());
    }

    @Test
    public void shouldDelegateTheUserLoginToLoginOperation() {
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        InputView inputView = mock(InputView.class);
        Login login = mock(Login.class);
        Authenticator authenticator = mock(Authenticator.class);
        OperationsFactory operationsFactory = mock(OperationsFactory.class);
        Factory factory = mock(Factory.class);
        when(session.typeOfUser()).thenReturn("guest");
        when(operationsFactory.returnNewLoginObject(inputView, authenticator, session, factory)).thenReturn(login);
        CheckIn checkIn = new CheckIn(library, session, authenticator, operationsFactory, inputView, factory);

        checkIn.delegateUserLoginToLoginOperation();

        verify(login, times(1)).execute();
    }
}