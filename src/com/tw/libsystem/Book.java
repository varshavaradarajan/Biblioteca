//Job of the book is to give information about the book name, author name and the year it was published in.
package com.tw.libsystem;

public class Book {
    private String bookName, authorName;
    private int year;

    public Book(String bookName, String authorName, int year) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.year = year;
    }

    @Override
    public String toString() {
        String bookDetails = "";
        bookDetails += bookName + "\t" + authorName + "\t" + year + "\t";
        return bookDetails;
    }

    @Override
    public boolean equals(Object otherObject) {
        if(otherObject != null && otherObject.getClass() == this.getClass()) {
            if (this == otherObject) {
                return true;
            }
            return true;
        }
        return false;
    }
}
