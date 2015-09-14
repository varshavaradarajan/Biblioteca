//Job of this class is to inform the library to return a list of books in the required format.
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
