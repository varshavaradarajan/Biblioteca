//Job of the parser id to covert the user input into a concrete operation.
package com.tw.libsystem;

public class Parser {

    private String inputCommand;
    private Library library;
    private MovieLibrary movieLibrary;
    private Session session;

    public Parser(String inputCommand, Library library, MovieLibrary movieLibrary, Session session) {
        this.inputCommand = inputCommand;
        this.library = library;
        this.movieLibrary = movieLibrary;
        this.session = session;
    }

    public Operations parse() {
        if(inputCommand.isEmpty() == false && inputCommand.length() == 1) {
            if(inputCommand.equals("1")) {
                ListBooks listBooks = new ListBooks(library);
                return listBooks;
            }

            else if(inputCommand.equals("2")) {
                CheckOut checkOut = new CheckOut(library, session);
                return checkOut;
            }

            else if(inputCommand.equals("3")) {
                InputView inputView = new InputView();
                CheckIn checkIn = new CheckIn(library, inputView);
                return checkIn;
            }

            else if(inputCommand.equals("4")) {
                ListMovies listMovies = new ListMovies(movieLibrary);
                return listMovies;
            }

            else if(inputCommand.equals("5")) {
                CheckOutMovie checkOutMovie = new CheckOutMovie(movieLibrary);
                return checkOutMovie;
            }
            else if(inputCommand.equals("6")) {
                InputView inputView = new InputView();
                Authenticator authenticator = new Authenticator();
                Login login = new Login(inputView, authenticator, session);
                return login;
            }

            else if(inputCommand.equals("0")) {
                ExitApplication exitApplication = new ExitApplication();
                return exitApplication;
            }

            else {
                return (new InvalidCommand());
            }

        }
        else {
            return (new InvalidCommand());
        }
    }
}
