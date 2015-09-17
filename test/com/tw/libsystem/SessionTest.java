package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class SessionTest {

    @Test
    public void shouldReturnTypeOfUser() {
        User user = new User("123-4567", "qwerty", "librarian", "Su", "su@gmail.com", "555-555-5555");
        Session session = new Session(user);

        assertEquals("librarian", session.typeOfUser());
    }

    @Test
    public void shouldSetUserOnceNewSessionIsCreated() {
        User user = new User("123-4567", "qwerty", "librarian", "Su", "su@gmail.com", "555-555-5555");
        Session session = new Session(user);
        session.setUser(new User("123-6789", "qwerty", "customer", "Su", "su@gmail.com", "555-555-5555"));

        assertEquals("customer", session.typeOfUser());
    }

    @Test
    public void shouldSetCurrentUserToDefaultUserOnceSessionEnds() {
        User user = new User("123-4567", "qwerty", "librarian", "Su", "su@gmail.com", "555-555-5555");
        Session session = new Session(user);
        session.setUser();

        assertEquals("guest", session.typeOfUser());
    }

}