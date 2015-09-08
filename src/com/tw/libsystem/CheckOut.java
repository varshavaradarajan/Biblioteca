//Job of this class is to remove a book from the library for the user.
package com.tw.libsystem;

public class CheckOut implements Operations {

    private Library library;
    private String checkOutMessage;

    public CheckOut(Library library) {
        this.library = library;
    }

    @Override
    public String execute() {
        Book book = new Book("Wuthering Heights", "bar", 2015);
        checkOutMessage = library.removeBook(book);
        return checkOutMessage;
    }
}
