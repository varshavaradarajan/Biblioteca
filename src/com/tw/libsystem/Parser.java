//Job of the parser id to covert the user input into a concrete operation.
package com.tw.libsystem;

public class Parser {

    private String inputCommand;
    private Library library;
    private MovieLibrary movieLibrary;
    private Session session;
    private OperationsFactory operationsFactory;

    public Parser(String inputCommand, Library library, MovieLibrary movieLibrary, Session session, OperationsFactory operationsFactory) {
        this.inputCommand = inputCommand;
        this.library = library;
        this.movieLibrary = movieLibrary;
        this.session = session;
        this.operationsFactory = operationsFactory;
    }

    public Operations parse() {
        if(inputCommand.isEmpty() == false && inputCommand.length() == 1) {
            if(inputCommand.equals("1")) {
                ListBooks listBooks = operationsFactory.returnNewListBooksObject(library);
                return listBooks;
            }

            else if(inputCommand.equals("2")) {
                CheckOut checkOut = operationsFactory.returnNewCheckOutObjects(library, session);
                return checkOut;
            }

            else if(inputCommand.equals("3")) {
                InputView inputView = new InputView();
                CheckIn checkIn = operationsFactory.returnNewCheckInObject(library, inputView);
                return checkIn;
            }

            else if(inputCommand.equals("4")) {
                ListMovies listMovies = operationsFactory.returnNewListMoviesObject(movieLibrary);
                return listMovies;
            }

            else if(inputCommand.equals("5")) {
                CheckOutMovie checkOutMovie = operationsFactory.returnNewCheckOutMoviesObject(movieLibrary);
                return checkOutMovie;
            }

            else if(inputCommand.equals("6")) {
                InputView inputView = new InputView();
                Authenticator authenticator = new Authenticator();
                Login login = operationsFactory.returnNewLoginObject(inputView, authenticator, session);
                return login;
            }

            else if(inputCommand.equals("0")) {
                ExitApplication exitApplication = operationsFactory.returnNewExitApplicationObject();
                return exitApplication;
            }

            else {
                return (operationsFactory.returnNewInvalidCommandObject());
            }

        }
        else {
            return (operationsFactory.returnNewInvalidCommandObject());
        }
    }
}
