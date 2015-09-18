//Job of this class is to remove a book from the library for the user.
package com.tw.libsystem;

public class CheckOut implements Operations {

    private InputView inputView;
    private Library library;
    private Session session;
    private OperationsFactory operationsFactory;
    private Authenticator authenticator;
    private String checkOutMessage = "That book is not available.\n", bookName, loginMessage;
    private Factory factory;

    public CheckOut(Library library, Session session, Authenticator authenticator, OperationsFactory operationsFactory, InputView inputView, Factory factory) {
        this.library = library;
        this.session = session;
        this.authenticator = authenticator;
        this.operationsFactory = operationsFactory;
        this.inputView = inputView;
        this.factory = factory;
    }

    @Override
    public String execute() {
        if (session.typeOfUser().equals("guest")) {
            delegateUserLoginToLoginOperation();
        }
        if(session.typeOfUser().equals("librarian") || session.typeOfUser().equals("customer")) {
            bookName = inputView.input();
            Book book = createBook();
            checkOutMessage = library.removeBook(book, session);
            return checkOutMessage;
        }
        return loginMessage;
    }

    Book createBook() {
        return new Book(bookName, "bar", 2015);
    }

    void delegateUserLoginToLoginOperation() {
        Login login = operationsFactory.returnNewLoginObject(inputView, authenticator, session, factory);
        loginMessage = login.execute();
    }
}
