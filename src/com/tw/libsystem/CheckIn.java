//Job of this class is to return a book to the library.
package com.tw.libsystem;

public class CheckIn implements Operations {

    private Library library;
    private String checkInMessage;
    private InputView inputView;

    public CheckIn(Library library) {
        this.library = library;
        inputView = new InputView();
    }

    @Override
    public String execute() {
        String bookName = inputView.input();
        checkInMessage = library.returnBook(new Book(bookName, "bar", 0));
        return checkInMessage;
    }
}
