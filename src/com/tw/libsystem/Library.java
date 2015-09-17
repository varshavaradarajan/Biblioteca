//Job of this class is to hold a set of pre-existing books so that the user can borrow and return books.
package com.tw.libsystem;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    ArrayList<Book> bookList;
    ArrayList<Book> checkedOutBooks;
    HashMap<String, String> borrowerDetails;

    public Library() {
        bookList = new ArrayList<>();
        bookList.add(new Book("Crime And Punishment", "Fyodor Dostoevsky", 1866));
        bookList.add(new Book("Wuthering Heights", "Emily Bronte", 1847));
        bookList.add(new Book("Pragmatic Programmer", "Dave Thomas", 1999));
        checkedOutBooks = new ArrayList<>();
        borrowerDetails = new HashMap<>();
    }

    @Override
    public String toString() {
        String bookNames = String.format("%-25s %-25s %-25s \n", "Bookname", "Author Name", "Year");
        for(Book names : bookList) {
            bookNames += names.toString() + "\n";
        }
        return bookNames;
    }

    public String removeBook(Book book, Session session) {
        if(bookList.contains(book)) {
            Book currentBook = bookList.get(bookList.indexOf(book));
            bookList.remove(book);
            checkedOutBooks.add(currentBook);
            borrowerDetails.put(currentBook.toString(), session.currentUserDetails());
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

    public String returnBook(Book book, Session session) {
        if(!compareDetails(session)) {
            return "That is not a valid book to be returned by you.\n";
        }
        if(bookList.contains(book) || !checkedOutBooks.contains(book)) {
            return "That is not a valid book to return.\n";
        }
        Book currentBook = checkedOutBooks.get(checkedOutBooks.indexOf(book));
        checkedOutBooks.remove(book);
        bookList.add(currentBook);
        borrowerDetails.remove(currentBook.toString());
        return "Thank you for returning the book.\n";
    }

    private boolean compareDetails(Session session) {
        for (String details : borrowerDetails.values()) {
            if(details.equals(session.currentUserDetails())) {
                return true;
            }
        }
        return false;
    }

    public String returnBorrowerDetails() {
        String details = String.format("%-25s %-25s %-25s %-25s %-25s %-25s\n", "BookName", "Author Name", "Year", "Name", "Email", "Phone Number");
        for(String bookInfo : borrowerDetails.keySet()) {
            details += bookInfo + " " + borrowerDetails.get(bookInfo);
        }
        return details;
    }
}
