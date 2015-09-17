package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class LogoutTest {

    @Test
    public void shouldDisplayALogoutMessageUponExecution() {
        Logout logout = new Logout();

        assertEquals("Successfully logged out.\n", logout.execute());
    }
}