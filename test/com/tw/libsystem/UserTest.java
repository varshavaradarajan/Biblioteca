package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void shouldReturnTrueIfObjectExists() {
        User user1 = new User("123-4567", "qwerty");
        User user2 = new User("765-4321", "asdf");

        assertEquals(user1, user2);
    }

}