package com.tw.libsystem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ControllerTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final ByteArrayInputStream inputStream = new ByteArrayInputStream("1".getBytes());

    @Before
    public void setStreams() {
        System.setOut(new PrintStream(outputStream));
        System.setIn(inputStream);
    }

    @After
    public void clearStreams() {
        System.setOut(System.out);
        System.setIn(System.in);
    }

    @Test
    public void shouldDelegateDisplayingMessageToDisplayClass() {
        Factory factory = new Factory();
        Controller controller = new Controller(factory);
        controller.run();

        assertEquals("Welcome to Biblioteca\n1. List Books\n", outputStream.toString());
    }

}