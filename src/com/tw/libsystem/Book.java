//Job of the book is to give information about the book name, author name and the year it was published in.
package com.tw.libsystem;

public class Book {
    private String bookName, authorName;

    public Book(String bookName, String authorName) {
        this.bookName = bookName;
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        String bookDetails = "";
        bookDetails += bookName + "\t" + authorName + "\t";
        return bookDetails;
    }
}
