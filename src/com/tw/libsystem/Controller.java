//Job of the controller class is to delegate the various operations to be performed.
package com.tw.libsystem;

public class Controller {

    public static final String WELCOME_MESSAGE = "Welcome to Biblioteca\n";
    private Factory factory;
    private Display display;
    private Menu menu;
    private InputView inputView;
    private String userInput, output;
    private Library library;
    private MovieLibrary movieLibrary;
    private Parser parser;
    private Operations operations;
    private Session session;

    public Controller(Factory factory, Library library, MovieLibrary movieLibrary) {
        this.factory = factory;
        this.library = library;
        this.movieLibrary = movieLibrary;
        session = new Session(new User("000-0000", "000-0000", "guest"));
    }

    public void run() {
        delegateWelcomeMessageToBeDisplayed();
        while (true) {
            delegateMenuToBeDisplayed();
            takeInput();
            delegateParsingInputToParser();
            output = operations.execute();
            delegateDisplayingOfOutputMessages();
        }
    }

    void delegateDisplayingOfOutputMessages() {
        display = factory.buildDisplay(output);
        display.displayMessage();
    }

    void delegateParsingInputToParser() {
        parser = factory.buildParser(userInput, library, movieLibrary, session);
        operations = parser.parse();
    }

    void takeInput() {
        inputView = factory.buildInputView();
        userInput = inputView.input();
    }

    void delegateMenuToBeDisplayed() {
        menu = factory.buildMenu();
        display = factory.buildDisplay(menu.toString());
        display.displayMessage();
    }

    void delegateWelcomeMessageToBeDisplayed() {
        display = factory.buildDisplay(WELCOME_MESSAGE);
        display.displayMessage();
    }
}
