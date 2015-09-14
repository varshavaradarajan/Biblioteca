//Job of this class is to inform the movie library to
package com.tw.libsystem;

public class ListMovies implements Operations {

    private MovieLibrary movieLibrary;

    public ListMovies(MovieLibrary movieLibrary) {
        this.movieLibrary = movieLibrary;
    }

    @Override
    public String execute() {
        String details = "Movie\tYear\tDirector\tRating\n";
        details += movieLibrary.toString();
        return details;
    }

}
