package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class LoginTest {

    @Test
    public void shouldReturnALoginMessageUponExecution() {
        InputView inputView = mock(InputView.class);
        Login login = new Login(inputView);

        assertEquals("Invalid username/password.\n", login.execute());
    }

    @Test
    public void shouldAcceptLibraryNumberAsInput() {
        InputView inputView = mock(InputView.class);
        Login login = new Login(inputView);
        when(inputView.input()).thenReturn("123-4567");
        login.execute();

        verify(inputView, times(1)).input();
    }
}