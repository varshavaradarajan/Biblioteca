package com.tw.libsystem;

public class OperationsFactory {

    private ListBooks listBooks;
    private ListMovies listMovies;
    private CheckOutMovie checkOutMovie;
    private ExitApplication exitApplication;
    private InvalidCommand invalidCommand;
    private Login login;
    private CheckOut checkOut;

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

    public CheckOut returnNewCheckOutObjects(Library library, Session session) {
        checkOut = new CheckOut(library, session);
        return checkOut;
    }
}
