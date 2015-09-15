package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class AuthenticatorTest {

    @Test
    public void shouldReturnInvalidIfUserIsNotRegistered() {
        Authenticator authenticator = new Authenticator();
        User user = new User("123-4567", "dumb", "customer");

        assertEquals("Invalid username/password.\n", authenticator.authenticate(user));
    }

    @Test
    public void shouldReturnASuccessfulLoginMessageIfUserIsRegistered() {
        Authenticator authenticator = new Authenticator();
        User user = new User("123-4567", "qwerty", "customer");

        assertEquals("Successful login.\n", authenticator.authenticate(user));
    }

}