package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class AuthenticatorTest {

    @Test
    public void shouldReturnInvalidIfUserIsNotRegistered() {
        Authenticator authenticator = new Authenticator();
        User user = new User("123-4567", "dumb", "customer", "Su", "su@gmail.com", "555-555-5555");
        Session session = new Session(user);

        assertEquals("Invalid username/password.\n", authenticator.authenticate("123-4567", "dumb", session));
    }

    @Test
    public void shouldReturnASuccessfulLoginMessageIfUserIsRegistered() {
        Authenticator authenticator = new Authenticator();
        User user = new User("123-4567", "qwerty", "customer", "Su", "su@gmail.com", "555-555-5555");
        Session session = new Session(user);

        assertEquals("Successful login.\n", authenticator.authenticate("123-4567", "qwerty", session));
    }

    @Test
    public void shouldStartASessionUponSuccessfulLogin() {
        Authenticator authenticator = new Authenticator();
        User user = new User("123-4567", "qwerty", "customer", "Su", "su@gmail.com", "555-555-5555");
        Session session = new Session(user);

        assertEquals("Successful login.\n", authenticator.authenticate("123-4567", "qwerty", session));
    }

}