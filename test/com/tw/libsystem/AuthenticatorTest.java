package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class AuthenticatorTest {

    @Test
    public void shouldReturnDefaultUserIfUserIsNotRegistered() {
        Authenticator authenticator = new Authenticator();
        User user = new User("000-0000", "000-0000", "guest");

        assertEquals(user, authenticator.authenticate(user));
    }

}