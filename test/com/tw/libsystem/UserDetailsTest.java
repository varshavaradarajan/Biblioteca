package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserDetailsTest {

    @Test
    public void shouldReturnTheDetailsOfTheUserInCurrentSession() {
        Session session = mock(Session.class);
        UserDetails userDetails = new UserDetails(session);
        String columns = String.format("%-25s %-25s %s\n", "Name", "Email", "Phone Number");
        String details = String.format("%-25s %-25s %s\n", "Su", "su@gmail.com", "555-555-5555");
        when(session.currentUserDetails()).thenReturn(columns+details);

        assertEquals(columns + details, userDetails.execute());
    }

}