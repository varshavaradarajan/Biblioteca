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
        String details = String.format("%-25s %-25s %-25s %s\n", movieName, year, director, rating);
        return details;
    }

    @Override
    public boolean equals(Object otherObject) {
        if(otherObject != null && otherObject.getClass() == Movie.class) {
            Movie otherMovie = (Movie)otherObject;
            if(this == otherMovie) {
                return true;
            }
            if(this.movieName.equals(otherMovie.movieName)){
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for (int i = 0; i < movieName.length(); i++) {
            hash = Character.getNumericValue(movieName.charAt(i)) + (hash << 6) + (hash << 16) - hash;
        }

        return hash;
    }
}
