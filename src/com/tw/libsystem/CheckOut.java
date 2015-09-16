//Job of this class is to remove a book from the library for the user.
package com.tw.libsystem;

public class CheckOut implements Operations {

    private InputView inputView;
    private Library library;
    private Session session;
    private OperationsFactory operationsFactory;
    private Authenticator authenticator;
    private String checkOutMessage = "That book is not available.\n", bookName, loginMessage;
    private Book book;

    public CheckOut(Library library, Session session, Authenticator authenticator, OperationsFactory operationsFactory, InputView inputView) {
        this.library = library;
        this.session = session;
        this.authenticator = authenticator;
        this.operationsFactory = operationsFactory;
        this.inputView = inputView;
    }

    @Override
    public String execute() {
        if (session.typeOfUser().equals("guest")) {
            delegateUserLoginToLoginOperation();
        }
        if(session.typeOfUser().equals("librarian") || session.typeOfUser().equals("customer")) {
            bookName = inputView.input();
            createBook();
            checkOutMessage = library.removeBook(book);
            return checkOutMessage;
        }
        return loginMessage;
    }

    void createBook() {
        book = new Book(bookName, "bar", 2015);
    }

    void delegateUserLoginToLoginOperation() {
        Login login = operationsFactory.returnNewLoginObject(inputView, authenticator, session);
        loginMessage = login.execute();
    }
}
