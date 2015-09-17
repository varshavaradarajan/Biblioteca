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

        when(session.typeOfUser()).thenReturn("librarian");
        when(inputView.input()).thenReturn("Wuthering Heights");

        CheckOut checkOut = new CheckOut(library, session, authenticator, operationsFactory, inputView);

        assertNotEquals("Thank You! Enjoy the book.\n", checkOut.execute());
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