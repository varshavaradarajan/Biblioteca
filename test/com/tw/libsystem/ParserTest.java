package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void shouldReturnInvalidCommandIfInputIsEmpty() {
        Library library = new Library();
        Parser parser = new Parser("", library);
        InvalidCommand invalidCommand = new InvalidCommand();

        assertEquals(invalidCommand.getClass(), parser.parse().getClass());
    }

    @Test
    public void shouldReturnInvalidIfInputLengthIsMoreThanOne() {
        Library library = new Library();
        Parser parser = new Parser("1 2", library);
        InvalidCommand invalidCommand = new InvalidCommand();

        assertEquals(invalidCommand.getClass(), parser.parse().getClass());
    }

    @Test
    public void shouldReturnAnOperationOnParsingTheInput() {
        Library library = new Library();
        Parser parser = new Parser("1", library);
        ListBooks listBooks = new ListBooks(library);

        assertEquals(listBooks.getClass(), parser.parse().getClass());
    }

    @Test
    public void shouldReturnInvalidCommandAsOperationForInvalidInput() {
        Library library = new Library();
        Parser parser = new Parser("a", library);
        InvalidCommand invalidCommand = new InvalidCommand();

        assertEquals(invalidCommand.getClass(), parser.parse().getClass());
    }

    @Test
    public void shouldReturnExitApplicationAsOperationOnParsingInputValue2() {
        Library library = new Library();
        Parser parser = new Parser("2", library);
        ExitApplication exitApplication = new ExitApplication();

        assertEquals(exitApplication.getClass(), parser.parse().getClass());
    }

}