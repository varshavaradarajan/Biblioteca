//Job of this class is to return a book to the library.
package com.tw.libsystem;

public class CheckIn implements Operations {

    private Library library;
    private String checkInMessage, loginMessage;
    private InputView inputView;
    private OperationsFactory operationsFactory;
    private Session session;
    private Authenticator authenticator;

    public CheckIn(Library library, Session session, Authenticator authenticator, OperationsFactory operationsFactory, InputView inputView) {
        this.library = library;
        this.inputView = inputView;
        this.session =session;
        this.authenticator = authenticator;
        this.operationsFactory = operationsFactory;
    }

    @Override
    public String execute() {
        if(session.typeOfUser().equals("guest")) {
            delegateUserLoginToLoginOperation();
        }
        if(session.typeOfUser().equals("librarian") || session.typeOfUser().equals("customer")) {
            String bookName = inputView.input();
            Book book = new Book(bookName, "bar", 0);
            checkInMessage = library.returnBook(book);
            return checkInMessage;
        }
        return loginMessage;
    }

    public void delegateUserLoginToLoginOperation() {
        Login login = operationsFactory.returnNewLoginObject(inputView, authenticator, session);
        loginMessage = login.execute();
    }
}
