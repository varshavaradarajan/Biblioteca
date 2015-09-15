package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void shouldReturnInvalidCommandIfInputIsEmpty() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("", library, movieLibrary);
        InvalidCommand invalidCommand = new InvalidCommand();

        assertEquals(invalidCommand.getClass(), parser.parse().getClass());
    }

    @Test
    public void shouldReturnInvalidIfInputLengthIsMoreThanOne() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("1 2", library, movieLibrary);
        InvalidCommand invalidCommand = new InvalidCommand();

        assertEquals(invalidCommand.getClass(), parser.parse().getClass());
    }

    @Test
    public void shouldReturnAnOperationOnParsingTheInput() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("1", library, movieLibrary);
        ListBooks listBooks = new ListBooks(library);

        assertEquals(listBooks.getClass(), parser.parse().getClass());
    }

    @Test
    public void shouldReturnInvalidCommandAsOperationForInvalidInput() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("a", library, movieLibrary);
        InvalidCommand invalidCommand = new InvalidCommand();

        assertEquals(invalidCommand.getClass(), parser.parse().getClass());
    }

    @Test
    public void shouldReturnExitApplicationAsOperationOnParsingInputValue0() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("0", library, movieLibrary);
        ExitApplication exitApplication = new ExitApplication();

        assertEquals(exitApplication.getClass(), parser.parse().getClass());
    }

    @Test
    public void shouldReturnCheckOutAsOperationOnParsingInputValue2() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        Parser parser = new Parser("2", library, movieLibrary);
        CheckOut checkOut = new CheckOut(library);

        assertEquals(checkOut.getClass(), parser.parse().getClass());
    }

    @Test
    public void shouldReturnCheckInAsOperationOnParsingInputValue3() {
        Library library = new Library();
        MovieLibrary movieLibrary = new MovieLibrary();
        InputView inputView = new InputView();
        Parser parser = new Parser("3", library, movieLibrary);
        CheckIn checkIn = new CheckIn(library, inputView);

        assertEquals(checkIn.getClass(), parser.parse().getClass());
    }

    @Test
    public void shouldReturnListMoviesAsOperationOnParsingInputValue4() {
        MovieLibrary movieLibrary = new MovieLibrary();
        Library library = new Library();
        Parser parser = new Parser("4", library, movieLibrary);

        assertEquals(ListMovies.class, parser.parse().getClass());
    }

    @Test
    public void shouldReturnCheckOutMoviesAsOperationOnParsingInputValue5() {
        MovieLibrary movieLibrary = new MovieLibrary();
        Library library = new Library();
        Parser parser = new Parser("5", library, movieLibrary);

        assertEquals(CheckOutMovie.class, parser.parse().getClass());
    }

}