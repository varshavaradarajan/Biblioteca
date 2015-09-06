package com.tw.libsystem;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void shouldReturnInvalidCommandIfInputIsEmpty() {
        Parser parser = new Parser("");
        InvalidCommand invalidCommand = new InvalidCommand();

        assertEquals(invalidCommand.getClass(), parser.parse().getClass());
    }

    @Test
    public void shouldReturnInvalidIfInputLengthIsMoreThanOne() {
        Parser parser = new Parser("1 2");
        InvalidCommand invalidCommand = new InvalidCommand();

        assertEquals(invalidCommand.getClass(), parser.parse().getClass());
    }

    @Test
    public void shouldReturnAnOperationOnParsingTheInput() {
        Parser parser = new Parser("1");
        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book("Gone Girl", "Flynn", 2010));
        ListOfBooks listOfBooks = new ListOfBooks(list);

        assertEquals(listOfBooks.getClass(), parser.parse().getClass());
    }

    @Test
    public void shouldReturnInvalidCommandAsOperationForInvalidInput() {
        Parser parser = new Parser("a");
        InvalidCommand invalidCommand = new InvalidCommand();

        assertEquals(invalidCommand.getClass(), parser.parse().getClass());
    }

}