//Job of the factory class is to instantiate new display objects.
package com.tw.libsystem;

import java.util.ArrayList;

public class Factory {

    private Display display;
    private InputView inputView;
    private Parser parser;
    private Menu menu;

    public Display buildDisplay(String message) {
        display = new Display(message);
        return display;
    }

    public InputView buildInputView() {
        inputView = new InputView();
        return inputView;
    }

    public Parser buildParser(String inputMessage, Library library, MovieLibrary movieLibrary) {
        parser = new Parser(inputMessage, library, movieLibrary);
        return parser;
    }

    public Menu buildMenu() {
        ArrayList<String> menuOptions = new ArrayList<>();
        menuOptions.add("1. List Books");
        menuOptions.add("2. Checkout");
        menuOptions.add("3. Check in");
        menuOptions.add("4. Exit");
        menu = new Menu(menuOptions);
        return menu;
    }
}
