//Job of the factory class is to instantiate new display objects.
package com.tw.libsystem;

import java.util.ArrayList;

public class Factory {
    public Display buildDisplay(String message) {
        Display display = new Display(message);
        return display;
    }

    public InputView buildInputView() {
        InputView inputView = new InputView();
        return inputView;
    }

    public Parser buildParser(String inputMessage, Library library, MovieLibrary movieLibrary, Session session, OperationsFactory operationsFactory, Authenticator authenticator, Factory factory) {
        Parser parser = new Parser(inputMessage, library, movieLibrary, session, operationsFactory, authenticator, factory);
        return parser;
    }

    public Menu buildMenu(Session session) {
        ArrayList<String> menuOptions = new ArrayList<>();
        menuOptions.add("0. Exit");
        menuOptions.add("1. List Books");
        menuOptions.add("2. Checkout Book");
        menuOptions.add("3. Check in Book");
        menuOptions.add("4. List Movies");
        menuOptions.add("5. Checkout Movie");
        if(session.typeOfUser().equals("guest")) {
            menuOptions.add("6. Login");
        }
        if(session.typeOfUser().equals("customer") || session.typeOfUser().equals("librarian")) {
            menuOptions.add("6. User Details");
            menuOptions.add("7. Logout");
        }
        if(session.typeOfUser().equals("librarian")) {
            menuOptions.add("8. Check Borrowers' Details");
        }
        Menu menu = new Menu(menuOptions);
        return menu;
    }

    public Authenticator buildAuthenticator() {
        Authenticator authenticator = new Authenticator();
        return authenticator;
    }
}
