//Job of the book is to give information about the book name, author name and the year it was published in.
package com.tw.libsystem;

public class Book {
    private String bookName;

    public Book(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        String bookDetails = "";
        bookDetails += bookName + "\t";
        return bookDetails;
    }
}
