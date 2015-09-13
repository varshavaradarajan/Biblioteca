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
        String bookNames = "Book Name\t\t\t\tAuthor Name\t\t\t\tYear\t\t\t\t\n";
        for(Book names : bookList) {
            bookNames += names.toString() + "\n";
        }
        return bookNames;
    }

    public String removeBook(Book book) {
        if(has(book, bookList)) {
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
        if(has(book, bookList) || !has(book, checkedOutBooks)) {
            return "Not a valid book to return.\n";
        }
        Book tempBook = checkedOutBooks.get(checkedOutBooks.indexOf(book));
        checkedOutBooks.remove(book);
        bookList.add(tempBook);
        return "Successfully Returned\n";
    }
}
