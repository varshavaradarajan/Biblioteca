package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class WelcomeMessageTest {

    @Test
    public void shouldReturnWelcomeMessage() {
        WelcomeMessage welcomeMessage = new WelcomeMessage("Welcome to Biblioteca");

        assertEquals("Welcome to Biblioteca\n", welcomeMessage.toString());
    }
}