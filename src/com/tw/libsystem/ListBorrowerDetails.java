//Job of this class is to list the details of all borrowers of books from the library.
package com.tw.libsystem;

public class ListBorrowerDetails implements Operations {

    private  Library library;

    public ListBorrowerDetails(Library library){
        this.library = library;
    }
    @Override
    public String execute() {
        String details =library.returnBorrowerDetails();
        if(details.isEmpty()) {
            details = "No borrowers.\n";
        }
        return details;
    }
}
