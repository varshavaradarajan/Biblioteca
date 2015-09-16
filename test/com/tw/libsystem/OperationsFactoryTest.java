package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class OperationsFactoryTest {

    @Test
    public void shouldReturnNewListBooksObjects() {
        OperationsFactory operationsFactory = new OperationsFactory();
        Library library = mock(Library.class);


        assertEquals(ListBooks.class, operationsFactory.returnNewListBooks(library).getClass());
    }

}