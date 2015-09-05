package com.tw.libsystem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DisplayTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setOutputStream() {
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void cleanOutputStream() {
        System.setOut(System.out);
    }

    @Test
    public void shouldDisplayAMessage() {
        Display display = new Display("Welcome to Biblioteca");
        display.displayMessage();

        assertEquals("Welcome to Biblioteca\n", outputStream.toString());
    }
}