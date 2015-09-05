package com.tw.libsystem;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ListOfBooksTest {

    @Test
    public void shouldReturnAPreExistingSetOfBooks() {
        ArrayList<String> listOfBooks = new ArrayList<>();
        listOfBooks.add("Crime And Punishment");
        listOfBooks.add("Wuthering Heights");
        listOfBooks.add("Pragmatic Programmer");

        ListOfBooks bookList = new ListOfBooks(listOfBooks);

        assertEquals("Crime And Punishment\nWuthering Heights\nPragmatic Programmer\n", bookList.toString());
    }
}