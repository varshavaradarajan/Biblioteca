package com.tw.libsystem;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class InputViewTest {

    private final ByteArrayInputStream inputStream = new ByteArrayInputStream("1".getBytes());

    @Before
    public void setInputStream() {
        System.setIn(inputStream);
    }

    @After
    public void clearInoutStream() {
        System.setIn(System.in);
    }

    @Test
    public void shouldReturnTheInputValue() {
        InputView inputView = new InputView();

        assertEquals("1", inputView.input());
    }
}