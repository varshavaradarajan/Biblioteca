//Job of the parser id to covert the user input into a concrete operation.
package com.tw.libsystem;

public class Parser {

    String inputCommand;
    Library library;

    public Parser(String inputCommand, Library library) {
        this.inputCommand = inputCommand;
        this.library = library;
    }

    public Operations parse() {
        if(inputCommand.isEmpty() == false && inputCommand.length() == 1) {
            if(inputCommand.equals("1")) {
                ListBooks listBooks = new ListBooks(library);
                return listBooks;
            }

            else if(inputCommand.equals("2")) {
                CheckOut checkOut = new CheckOut(library);
                return checkOut;
            }

            else if(inputCommand.equals("3")) {
                InputView inputView = new InputView();
                CheckIn checkIn = new CheckIn(library, inputView);
                return checkIn;
            }

            else if(inputCommand.equals("4")) {
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
