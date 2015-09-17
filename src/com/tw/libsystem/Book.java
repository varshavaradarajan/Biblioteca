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
        bookDetails = String.format("%-25s %-25s %s", bookName, authorName, year);
        return bookDetails;
    }

    @Override
    public boolean equals(Object otherObject) {
        if(otherObject != null && otherObject.getClass() == this.getClass()) {
            Book otherBook = (Book)otherObject;
            if (this == otherBook) {
                return true;
            }
            else if(this.bookName.equals(otherBook.bookName)) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for (int i = 0; i < bookName.length(); i++) {
            hash = Character.getNumericValue(bookName.charAt(i)) + (hash << 6) + (hash << 16) - hash;
        }

        return hash;
    }

}
