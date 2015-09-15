package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class LoginTest {

    @Test
    public void shouldReturnALoginMessageUponExecution() {
        Login login = new Login();

        assertEquals("Invalid username/password.\n", login.execute());
    }
}