package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListBorrowerDetailsTest {

    @Test
    public void shouldReturnAllBorrowerDetailsUponExecution() {
        Library library = mock(Library.class);
        ListBorrowerDetails listBorrowerDetails = new ListBorrowerDetails(library);
        String columns = String.format("%-25s %-25s %-25s %-25s %-25s %-25s\n", "BookName", "Author Name", "Year", "Name", "Email", "Phone Number");
        String borrowerDetails = String.format("%-25s %-25s %-25s %-25s %-25s %-25s\n", "Wuthering Heights", "Emily Bronte", "1847", "Su", "su@gmail.com", "555-555-5555");
        when(library.returnBorrowerDetails()).thenReturn(columns + borrowerDetails);

        assertEquals(columns + borrowerDetails, listBorrowerDetails.execute());
    }

    @Test
    public void shouldReturnNoBorrowerMessageUponExecutionWhenNoUserHasBorrowedBooks() {
        Library library = mock(Library.class);
        ListBorrowerDetails listBorrowerDetails = new ListBorrowerDetails(library);
        when(library.returnBorrowerDetails()).thenReturn("");

        assertEquals("No borrowers.\n", listBorrowerDetails.execute());
    }

}