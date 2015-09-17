//Job of this class is to hold a set of pre-existing books so that the user can borrow and return books.
package com.tw.libsystem;

import java.util.ArrayList;

public class Library {

    ArrayList<Book> bookList;
    ArrayList<Book> checkedOutBooks;

    public Library() {
        bookList = new ArrayList<>();
        bookList.add(new Book("Crime And Punishment", "Fyodor Dostoevsky", 1866));
        bookList.add(new Book("Wuthering Heights", "Emily Bronte", 1847));
        bookList.add(new Book("Pragmatic Programmer", "Dave Thomas", 1999));
        checkedOutBooks = new ArrayList<>();
    }

    @Override
    public String toString() {
        String bookNames = String.format("%-40s %-40s %s \n", "Bookname", "Author Name", "Year");
        for(Book names : bookList) {
            bookNames += names.toString() + "\n";
        }
        return bookNames;
    }

    public String removeBook(Book book) {
        if(bookList.contains(book)) {
            Book tempBook = bookList.get(bookList.indexOf(book));
            bookList.remove(book);
            checkedOutBooks.add(tempBook);
            return "Thank You!Enjoy the book.\n";
        }
        return "That book is not available.\n";
    }

    public boolean has(Book otherBook, ArrayList<Book> listOfBooks) {
        for(Book book : listOfBooks) {
            if(book.equals(otherBook))
                return true;
        }
        return false;
    }

    public String returnBook(Book book) {
        if(bookList.contains(book) || !checkedOutBooks.contains(book)) {
            return "That is not a valid book to return.\n";
        }
        Book tempBook = checkedOutBooks.get(checkedOutBooks.indexOf(book));
        checkedOutBooks.remove(book);
        bookList.add(tempBook);
        return "Thank you for returning the book.\n";
    }
}
