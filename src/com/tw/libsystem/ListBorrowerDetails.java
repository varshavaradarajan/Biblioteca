//Job of this class is to list the details of all borrowers of books from the library.
package com.tw.libsystem;

public class ListBorrowerDetails implements Operations {

    private  Library library;

    public ListBorrowerDetails(Library library){
        this.library = library;
    }
    @Override
    public String execute() {
        return library.returnBorrowerDetails();
    }
}
