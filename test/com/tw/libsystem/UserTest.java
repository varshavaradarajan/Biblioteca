package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void shouldReturnTrueIfObjectExists() {
        User user1 = new User("123-4567", "qwerty");
        User user2 = new User("123-4567", "qwerty");

        assertEquals(user1, user2);
    }

    @Test
    public void shouldReturnFalseIfObjectDoesNotExist() {
        User user = new User("123-4567", "qwerty");

        assertNotEquals(user, null);
    }

    @Test
    public void shouldNotBeEqualToAnotherObjectOfADifferentType() {
        User user1 = new User("123-4567", "qwerty");
        Book book = new Book("Vilette", "Charlotte Bronte", 1842);

        assertNotEquals(user1, book);
    }

    @Test
    public void shouldBeEqualToUserWithSameLibraryNumber() {
        User user1 = new User("123-4567", "qwerty");
        User user2 = new User("123-4567", "qwerty");

        assertEquals(user1, user2);
    }

    @Test
    public void shouldBeEqualToUserWithSamePasswordWithSameLogin() {
        User user1 = new User("123-4567", "qwerty");
        User user2 = new User("123-4567", "qwerty");

        assertEquals(user1, user2);
    }

    @Test
    public void shouldBeEqualToItself() {
        User user = new User("123-4567", "qwerty");

        assertEquals(user, user);
    }

    @Test
    public void shouldReturnSameHashCodeForSameObjects() {
        User user = new User("123-4567", "qwerty");

        assertEquals(user.hashCode(), user.hashCode());
    }

    @Test
    public void shouldReturnDifferentHashCodeForDifferentObjects() {
        User user1 = new User("123-4567", "qwerty");
        User user2 = new User("123-4567", "qwert");

        assertNotEquals(user1.hashCode(), user2.hashCode());
    }

}