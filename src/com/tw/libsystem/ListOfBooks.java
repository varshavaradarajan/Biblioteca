//Job of the List of books is to hold a preexisting set of books.
package com.tw.libsystem;

import java.util.ArrayList;

public class ListOfBooks {
    ArrayList<Book> listOfBooks;

    public ListOfBooks(ArrayList listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    @Override
    public String toString() {
        String bookNames = "";
        for(Book names : listOfBooks) {
            bookNames += names.toString() + "\n";
        }
        return bookNames;
    }
}
