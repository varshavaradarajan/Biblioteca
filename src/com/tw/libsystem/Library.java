package com.tw.libsystem;

import java.util.ArrayList;

public class Library {

    ArrayList<Book> bookList;

    public Library() {
        bookList = new ArrayList<>();
        bookList.add(new Book("Crime And Punishment", "Fyodor Dostoevsky", 1866));
        bookList.add(new Book("Wuthering Heights", "Emily Bronte", 1847));
        bookList.add(new Book("Pragmatic Programmer", "Dave Thomas", 1999));
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
        bookList.remove(book);
        return "Removed Book Successfully";
    }

    public boolean has(Book otherBook) {
        for(Book book : bookList) {
            if(book.equals(otherBook))
                return true;
        }
        return false;
    }
}
