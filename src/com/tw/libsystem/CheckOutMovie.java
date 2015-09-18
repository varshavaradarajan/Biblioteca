//Job of this class is to inform the movie library to remove a specified movie from its list of movies.
package com.tw.libsystem;

public class CheckOutMovie implements Operations {

    private MovieLibrary movieLibrary;
    private String checkOutMovieMessage = "That movie is not available";
    private InputView inputView;
    private Factory factory;

    public CheckOutMovie(MovieLibrary movieLibrary, Factory factory) {
        this.movieLibrary = movieLibrary;
        this.factory = factory;
    }

    @Override
    public String execute() {
        Display display = factory.buildDisplay("Enter Movie Name: ");
        display.displayMessage();
        InputView inputView = factory.buildInputView();
        String movieName = inputView.input();
        Movie movie = new Movie(movieName, 2009, "Foo", "unrated");
        checkOutMovieMessage = movieLibrary.removeMovie(movie);
        return checkOutMovieMessage;
    }
}
