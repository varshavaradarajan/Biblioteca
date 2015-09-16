//Job of this class is to remove a book from the library for the user.
package com.tw.libsystem;

public class CheckOut implements Operations {

    private InputView inputView = new InputView();
    private Library library;
    private Session session;
    private String checkOutMessage = "That book is not available.\n", bookName;

    public CheckOut(Library library, Session session) {
        this.library = library;
        this.session = session;
    }

    @Override
    public String execute() {
        if (session.typeOfUser().equals("guest")) {
            delegateUserLoginToLoginOperation();
        }
        bookName = inputView.input();
        Book book = new Book(bookName, "bar", 2015);
        checkOutMessage = library.removeBook(book);
        return checkOutMessage;
    }

    void delegateUserLoginToLoginOperation() {

    }
}
