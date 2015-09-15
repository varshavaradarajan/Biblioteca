package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class AuthenticatorTest {

    @Test
    public void shouldReturnInvalidIfUserIsNotRegistered() {
        Authenticator authenticator = new Authenticator();

        assertEquals("Invalid username/password.\n", authenticator.authenticate());
    }

}