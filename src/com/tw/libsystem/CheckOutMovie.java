//Job of this class is to inform the movie library to remove a specified movie from its list of movies.
package com.tw.libsystem;

public class CheckOutMovie implements Operations {

    private MovieLibrary movieLibrary;
    private String checkOutMovieMessage;

    public CheckOutMovie(MovieLibrary movieLibrary) {
        this.movieLibrary = movieLibrary;
    }

    @Override
    public String execute() {
        checkOutMovieMessage ="Thank You! Enjoy the movie.\n";
        return checkOutMovieMessage;
    }
}
