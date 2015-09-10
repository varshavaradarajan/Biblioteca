package com.tw.libsystem;

import com.sun.corba.se.spi.orb.Operation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ControllerTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final ByteArrayInputStream inputStream = new ByteArrayInputStream("1".getBytes());

    @Before
    public void setStreams() {
        System.setOut(new PrintStream(outputStream));
        System.setIn(inputStream);
    }

    @Test
    public void shouldDelegateDisplayingOfWelcomeMessage() {
        Library library = new Library();
        Factory factory = new Factory();
        Controller controller = new Controller(factory,library);
        controller.delegateWelcomeMessageToBeDisplayed();

        assertEquals("Welcome to Biblioteca\n", outputStream.toString());

    }
}