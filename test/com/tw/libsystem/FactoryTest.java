package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryTest {

    @Test
    public void shouldReturnNewDisplayObjects() {
        Factory factory = new Factory();
        String message = "Welcome";

        assertEquals(Display.class, factory.buildDisplay(message).getClass());
    }

    @Test
    public void shouldReturnNewInputViewObjects() {
        Factory factory = new Factory();

        assertEquals(InputView.class, factory.buildInputView().getClass());
    }

    @Test
    public void shouldReturnNewParserObject() {
        Factory factory = new Factory();
        Library library = new Library();
        String inputMessage = "1";

        assertEquals(Parser.class, factory.buildParser(inputMessage, library).getClass());
    }

    @Test
    public void shouldReturnNewMenus() {
        Factory factory = new Factory();

        assertEquals(Menu.class, factory.buildMenu().getClass());
    }
}