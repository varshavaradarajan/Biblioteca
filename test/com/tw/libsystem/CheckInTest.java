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
    public void shouldDelegateTheUserLoginToLoginOperation() {
        Library library = mock(Library.class);
        Session session = mock(Session.class);
        InputView inputView = mock(InputView.class);
        Login login = mock(Login.class);
        Authenticator authenticator = mock(Authenticator.class);
        OperationsFactory operationsFactory = mock(OperationsFactory.class);
        when(session.typeOfUser()).thenReturn("guest");
        when(operationsFactory.returnNewLoginObject(inputView, authenticator, session)).thenReturn(login);
        CheckIn checkIn = new CheckIn(library, session, authenticator, operationsFactory, inputView);

        checkIn.delegateUserLoginToLoginOperation();

        verify(login, times(1)).execute();
    }

}