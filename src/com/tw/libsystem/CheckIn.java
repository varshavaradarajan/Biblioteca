//Job of this class is to return a book to the library.
package com.tw.libsystem;

public class CheckIn implements Operations {

    private Library library;
    private String checkInMessage;
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
        String bookName = inputView.input();
        Book book = new Book(bookName, "bar", 0);
        checkInMessage = library.returnBook(book);
        return checkInMessage;
    }

    public void delegateUserLoginToLoginOperation() {
        Login login = operationsFactory.returnNewLoginObject(inputView, authenticator, session);
        login.execute();
    }
}
