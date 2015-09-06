package com.tw.libsystem;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void shouldReturnNullIfInputIsEmpty() {
        Parser parser = new Parser("");

        assertEquals(null, parser.parse());
    }

    @Test
    public void shouldReturnNullIfInputLengthIsMoreThanOne() {
        Parser parser = new Parser("1 2");

        assertEquals(null, parser.parse());
    }

    @Test
    public void shouldReturnAnOperationOnParsingTheInput() {
        Parser parser = new Parser("1");
        ArrayList<Book> list = new ArrayList<>();
        list.add(new Book("Gone Girl", "Flynn", 2010));
        ListOfBooks listOfBooks = new ListOfBooks(list);

        assertEquals(listOfBooks.getClass(), parser.parse().getClass());
    }

}