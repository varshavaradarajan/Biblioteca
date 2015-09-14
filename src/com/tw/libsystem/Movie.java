//Job of this class is to give information about the movie name, year, director and movie rating.
package com.tw.libsystem;

public class Movie {

    private String movieName, director;
    private int year, rating;

    @Override
    public String toString() {
        String details = "";
        details = "The Departed\t2006\tMartin Scorsese\t9";
        return details;
    }
}
