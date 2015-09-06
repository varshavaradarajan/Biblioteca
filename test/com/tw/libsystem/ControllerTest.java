package com.tw.libsystem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ControllerTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setOutputStream() {
        System.setOut(new PrintStream(outputStream));
    }

    @After
    public void clearOutputStream() {
        System.setOut(System.out);
    }

    @Test
    public void shouldCreateAFactoryForManufacturingDisplays() {
        Controller controller = new Controller();

        assertEquals(Factory.class, controller.createFactory().getClass());
    }

    @Test
    public void shouldDelegateDisplayingOfWelcomeMessage() {
        Controller controller = new Controller();
        controller.run();
        assertEquals("Welcome to Biblioteca\n", outputStream.toString());
    }
    
}