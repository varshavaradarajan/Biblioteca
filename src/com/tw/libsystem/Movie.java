//Job of this class is to give information about the movie name, year, director and movie rating.
package com.tw.libsystem;

public class Movie {

    private String movieName, director, rating;
    private int year;

    public Movie(String movieName, int year, String director, String rating) {
        this.movieName = movieName;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    @Override
    public String toString() {
        String details = "";
        details = movieName + "\t" + year + "\t" + director + "\t" + rating + "\n";
        return details;
    }
}
