//Job of the controller class is to delegate the various operations to be performed.
package com.tw.libsystem;

public class Controller {

    public static final String WELCOME_MESSAGE = "Welcome to Biblioteca\n";
    private Factory factory;
    private Display display;
    private String userInput, output;
    private Library library;
    private MovieLibrary movieLibrary;;
    private Operations operations;
    private Session session;
    private OperationsFactory operationsFactory;

    public Controller(Factory factory, Library library, MovieLibrary movieLibrary, OperationsFactory operationsFactory, Session session) {
        this.factory = factory;
        this.library = library;
        this.movieLibrary = movieLibrary;
        this.operationsFactory = operationsFactory;
        this.session = session;
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
        Authenticator authenticator = factory.buildAuthenticator();
        Parser parser = factory.buildParser(userInput, library, movieLibrary, session, operationsFactory, authenticator, factory);
        operations = parser.parse();
    }

    void takeInput() {
        InputView inputView = factory.buildInputView();
        userInput = inputView.input();
    }

    void delegateMenuToBeDisplayed() {
         Menu menu = factory.buildMenu(session);
        display = factory.buildDisplay(menu.toString());
        display.displayMessage();
    }

    void delegateWelcomeMessageToBeDisplayed() {
        display = factory.buildDisplay(WELCOME_MESSAGE);
        display.displayMessage();
    }
}
