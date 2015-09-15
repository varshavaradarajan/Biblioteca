//Job of this class is to inform the movie library to remove a specified movie from its list of movies.
package com.tw.libsystem;

public class CheckOutMovie implements Operations {

    private MovieLibrary movieLibrary;
    private String checkOutMovieMessage = "That movie is not available";
    private InputView inputView;

    public CheckOutMovie(MovieLibrary movieLibrary) {
        this.movieLibrary = movieLibrary;
        inputView = new InputView();
    }

    @Override
    public String execute() {
        String movieName = inputView.input();
        Movie movie = new Movie(movieName, 2009, "Foo", "unrated");
        checkOutMovieMessage = movieLibrary.removeMovie(movie);
        return checkOutMovieMessage;
    }
}
