package com.tw.libsystem;

public class OperationsFactory {

    private ListBooks listBooks;
    private ListMovies listMovies;
    private CheckOutMovie checkOutMovie;
    private ExitApplication exitApplication;
    private InvalidCommand invalidCommand;
    private Login login;
    private CheckOut checkOut;
    private CheckIn checkIn;

    public ListBooks returnNewListBooksObject(Library library) {
        listBooks = new ListBooks(library);
        return listBooks;
    }

    public ListMovies returnNewListMoviesObject(MovieLibrary movieLibrary) {
        listMovies = new ListMovies(movieLibrary);
        return listMovies;
    }

    public CheckOutMovie returnNewCheckOutMoviesObject(MovieLibrary movieLibrary) {
        checkOutMovie = new CheckOutMovie(movieLibrary);
        return checkOutMovie;
    }

    public ExitApplication returnNewExitApplicationObject() {
        exitApplication = new ExitApplication();
        return exitApplication;
    }

    public InvalidCommand returnNewInvalidCommandObject() {
        invalidCommand = new InvalidCommand();
        return invalidCommand;
    }

    public Login returnNewLoginObject(InputView inputView, Authenticator authenticator, Session session) {
        login = new Login(inputView, authenticator, session);
        return login;
    }

    public CheckOut returnNewCheckOutObjects(Library library, Session session, Authenticator authenticator, OperationsFactory operationsFactory, InputView inputView) {
        checkOut = new CheckOut(library, session, authenticator, operationsFactory, inputView);
        return checkOut;
    }

    public CheckIn returnNewCheckInObject(Library library, InputView inputView) {
        checkIn = new CheckIn(library, inputView);
        return checkIn;
    }
}
