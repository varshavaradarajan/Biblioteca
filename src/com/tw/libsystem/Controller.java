//Job of the controller class is to delegate the various operations to be performed.
package com.tw.libsystem;

import java.util.ArrayList;

public class Controller {

    private Factory factory;
    private Display display;
    private Menu menu;
    private InputView inputView;
    private String userInput;
    private Library library;

    public Controller(Factory factory, Library library) {
        this.factory = factory;
        this.library = library;
    }

    public void run() {
        delegateWelcomeMessageToBeDisplayed();
        delegateMenuToBeDisplayed();
        takeInput();
    }

    private void takeInput() {
        inputView = factory.buildInputView();
        userInput = inputView.input();
    }

    private void delegateMenuToBeDisplayed() {
        ArrayList<String> menuOptions = new ArrayList<>();
        menuOptions.add("1. List Books");
        menu = new Menu(menuOptions);
        display = factory.buildDisplay(menu.toString());
        display.displayMessage();
    }

     void delegateWelcomeMessageToBeDisplayed() {
        display = factory.buildDisplay("Welcome to Biblioteca\n");
        display.displayMessage();
    }
}
