//Job of this class is to return a book to the library.
package com.tw.libsystem;

public class CheckIn implements Operations {

    private Library library;
    private String checkInMessage, loginMessage, bookName;
    private InputView inputView;
    private OperationsFactory operationsFactory;
    private Session session;
    private Authenticator authenticator;
    private Factory factory;

    public CheckIn(Library library, Session session, Authenticator authenticator, OperationsFactory operationsFactory, InputView inputView, Factory factory) {
        this.library = library;
        this.inputView = inputView;
        this.session =session;
        this.authenticator = authenticator;
        this.operationsFactory = operationsFactory;
        this.factory = factory;
    }

    @Override
    public String execute() {
        if(session.typeOfUser().equals("guest")) {
            delegateUserLoginToLoginOperation();
        }
        if(session.typeOfUser().equals("librarian") || session.typeOfUser().equals("customer")) {
            Display display = factory.buildDisplay("Enter Book Name: ");
            display.displayMessage();
            bookName = inputView.input();
            Book book = createBook();
            checkInMessage = library.returnBook(book, session);
            return checkInMessage;
        }
        return loginMessage;
    }

    Book createBook() {
        return new Book(bookName, "bar", 0);
    }

    public void delegateUserLoginToLoginOperation() {
        Login login = operationsFactory.returnNewLoginObject(inputView, authenticator, session, factory);
        loginMessage = login.execute();
    }
}
