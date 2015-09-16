package com.tw.libsystem;

public class OperationsFactory {

    private ListBooks listBooks;

    public ListBooks returnNewListBooks(Library library) {
        listBooks = new ListBooks(library);
        return listBooks;
    }
}
