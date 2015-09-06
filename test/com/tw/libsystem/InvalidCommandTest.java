package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class InvalidCommandTest {

    @Test
    public void shouldReturnAMessageWhenTheOperationIsInvoked() {
        InvalidCommand invalidCommand = new InvalidCommand();

        assertEquals("Select a valid option!\n", invalidCommand.execute());
    }

}