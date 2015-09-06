package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void shouldReturnTrueIfInputIsNotEmpty() {
        Parser parser = new Parser("a");

        assertEquals(true, parser.parse());
    }

    @Test
    public void shouldReturnTrueIfInputLengthIsOne() {
        Parser parser = new Parser("1");

        assertEquals(true, parser.parse());
    }

}