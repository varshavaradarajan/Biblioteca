package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class LogoutTest {

    @Test
    public void shouldDisplayALogoutMessageUponExecution() {
        Session session = mock(Session.class);
        Logout logout = new Logout(session);

        assertEquals("Successfully logged out.\n", logout.execute());
    }

    @Test
    public void shouldChangeCurrentSessionToGuestSessionUponExecution() {
        Session session = mock(Session.class);
        Logout logout = new Logout(session);
        logout.execute();

        verify(session, times(1)).setUser();
    }
}