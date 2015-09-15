package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    @Test
    public void shouldReturnMovieDetails() {
        Movie movie = new Movie("The Departed", 2006, "Martin Scorsese", "9");

        assertEquals("The Departed\t2006\tMartin Scorsese\t9\n", movie.toString());
    }

    @Test
    public void shouldReturnDetailsOfAnyMovie() {
        Movie movie = new Movie("The Godfather", 1972, "Francis Ford Cuppola", "10");

        assertEquals("The Godfather\t1972\tFrancis Ford Cuppola\t10\n", movie.toString());
    }

    @Test
    public void shouldReturnTrueIfMovieExists() {
        Movie movie1 = new Movie("The Departed", 2006, "Martin Scorsese", "9");
        Movie movie2 = new Movie("The Departed", 2006, "Martin Scorsese", "9");

        assertEquals(movie1, movie2);
    }

    @Test
    public void shouldReturnFalseIfOtherMovieDoesNotExist() {
        Movie movie = new Movie("The Godfather", 1972, "Francis Ford Cuppola", "10");

        assertNotEquals(movie, null);
    }

    @Test
    public void shouldReturnTrueIfOtherObjectIsOfTheSameType() {
        Movie movie1 = new Movie("The Departed", 2006, "Martin Scorsese", "9");
        Movie movie2 = new Movie("The Departed", 2006, "Martin Scorsese", "9");

        assertEquals(movie1, movie2);
    }

    @Test
    public void shouldReturnFalseIfOtherObjectIsOfADifferentType() {
        Movie movie = new Movie("The Departed", 2006, "Martin Scorsese", "9");
        Book book = new Book("Rebecca", "Daphne du Maurier", 1938);

        assertNotEquals(movie, book);
    }

    @Test
    public void shouldBeEqualToItself() {
        Movie movie = new Movie("The Godfather", 1972, "Francis Ford Cuppola", "10");

        assertEquals(movie, movie);
    }

    @Test
    public void shouldBeEqualToAMovieWithTheSameName() {
        Movie movie1 = new Movie("The Departed", 2006, "Martin Scorsese", "9");
        Movie movie2 = new Movie("The Departed", 2006, "Martin Scorsese", "9");

        assertEquals(movie1, movie2);
    }

    @Test
    public void shouldNotBeEqualToAMovieWithADifferentName() {
        Movie movie1 = new Movie("The Departed", 2006, "Martin Scorsese", "9");
        Movie movie2 = new Movie("The Godfather", 2006, "Martin Scorsese", "9");

        assertNotEquals(movie1, movie2);
    }

    @Test
    public void shouldHaveSameHashCodeForSameObject() {
        Movie movie = new Movie("The Godfather", 1972, "Francis Ford Cuppola", "10");

        assertEquals(movie.hashCode(), movie.hashCode());
    }

    @Test
    public void shouldHaveDifferentHashCodeForDifferentObjects() {
        Movie movie1 = new Movie("The Departed", 2006, "Martin Scorsese", "9");
        Movie movie2 = new Movie("The Godfather", 2006, "Martin Scorsese", "9");

        assertNotEquals(movie1.hashCode(), movie2.hashCode());
    }
}