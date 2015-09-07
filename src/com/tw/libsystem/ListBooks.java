//Job of the List of books is to hold a preexisting set of books.
package com.tw.libsystem;

public class ListBooks implements Operations {
    Library library;

    public ListBooks(Library library) {
        this.library = library;
    }

    @Override
    public String execute() {
        return library.toString();
    }
}
