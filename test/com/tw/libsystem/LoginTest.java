package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class LoginTest {

    @Test
    public void shouldReturnALoginMessageUponExecution() {
        InputView inputView = mock(InputView.class);
        Authenticator authenticator = mock(Authenticator.class);
        Session session = mock(Session.class);
        String userName = "123-4567";
        String password = "qwerty";

        when(inputView.input()).thenReturn(userName).thenReturn(password);
        when(authenticator.authenticate(userName, password, session)).thenReturn("Invalid username/password.\n");
        Login login = new Login(inputView, authenticator, session);

        assertEquals("Invalid username/password.\n", login.execute());
    }

    @Test
    public void shouldAcceptLibraryNumberAsInput() {
        InputView inputView = mock(InputView.class);
        Authenticator authenticator = mock(Authenticator.class);
        Session session = mock(Session.class);
        Login login = new Login(inputView, authenticator, session);
        when(inputView.input()).thenReturn("123-4567");
        login.acceptUsernameFromUser();

        verify(inputView, times(1)).input();
    }

    @Test
    public void shouldAcceptPasswordAsInputFromUser() {
        InputView inputView = mock(InputView.class);
        Authenticator authenticator = mock(Authenticator.class);
        Session session = mock(Session.class);
        Login login = new Login(inputView, authenticator, session);
        when(inputView.input()).thenReturn("qwerty");
        login.acceptPasswordFromUser();

        verify(inputView, times(1)).input();
    }
}