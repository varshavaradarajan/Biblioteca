package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class SessionTest {

    @Test
    public void shouldReturnTypeOfUser() {
        User user = new User("123-4567", "qwerty", "librarian");
        Session session = new Session(user);

        assertEquals("librarian", session.typeOfUser());
    }

}