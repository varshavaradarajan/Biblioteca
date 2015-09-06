package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void shouldReturnTrueIfInputIsNotEmpty() {
        Parser parser = new Parser("1");

        assertEquals(true, parser.parse());
    }

}