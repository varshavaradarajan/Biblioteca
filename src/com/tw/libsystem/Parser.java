//Job of the parser id to covert the user input into a concrete operation.
package com.tw.libsystem;

import java.util.ArrayList;

public class Parser {

    String inputCommand;
    Library library;

    public Parser(String inputCommand, Library library) {
        this.inputCommand = inputCommand;
        this.library = library;
    }

    public Operations parse() {
        if(inputCommand.isEmpty() == false && inputCommand.length() == 1) {
            if(inputCommand == "1") {
                ListBooks listBooks = new ListBooks(library);
                return listBooks;
            }

            else if(inputCommand == "2") {
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
