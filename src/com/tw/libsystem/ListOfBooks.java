//Job of the List of books is to hold a preexisting set of books.
package com.tw.libsystem;

import java.util.ArrayList;

public class ListOfBooks {
    ArrayList<String> listOfBooks;

    public ListOfBooks(ArrayList listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    @Override
    public String toString() {
        String bookNames = "";
        for(String names : listOfBooks) {
            bookNames += names + "\n";
        }
        return bookNames;
    }

}
