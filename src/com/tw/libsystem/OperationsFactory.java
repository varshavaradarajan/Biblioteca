package com.tw.libsystem;

public class OperationsFactory {

    public ListBooks returnNewListBooksObject(Library library) {
        ListBooks listBooks = new ListBooks(library);
        return listBooks;
    }

    public ListMovies returnNewListMoviesObject(MovieLibrary movieLibrary) {
        ListMovies listMovies = new ListMovies(movieLibrary);
        return listMovies;
    }

    public CheckOutMovie returnNewCheckOutMoviesObject(MovieLibrary movieLibrary, Factory factory) {
        CheckOutMovie checkOutMovie = new CheckOutMovie(movieLibrary, factory);
        return checkOutMovie;
    }

    public ExitApplication returnNewExitApplicationObject() {
        ExitApplication exitApplication = new ExitApplication();
        return exitApplication;
    }

    public InvalidCommand returnNewInvalidCommandObject() {
        InvalidCommand invalidCommand = new InvalidCommand();
        return invalidCommand;
    }

    public Login returnNewLoginObject(InputView inputView, Authenticator authenticator, Session session, Factory factory) {
        Login login = new Login(inputView, authenticator, session, factory);
        return login;
    }

    public CheckOut returnNewCheckOutObjects(Library library, Session session, Authenticator authenticator, OperationsFactory operationsFactory, InputView inputView, Factory factory) {
        CheckOut checkOut = new CheckOut(library, session, authenticator, operationsFactory, inputView, factory);
        return checkOut;
    }

    public CheckIn returnNewCheckInObject(Library library, InputView inputView, Authenticator authenticator, OperationsFactory operationsFactory, Session session, Factory factory) {
        CheckIn checkIn = new CheckIn(library, session, authenticator, operationsFactory, inputView, factory);
        return checkIn;
    }
}
