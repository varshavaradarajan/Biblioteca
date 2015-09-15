package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {

    @Test
    public void shouldReturnTrueIfObjectExists() {
        User user1 = new User("123-4567", "qwerty", "librarian");
        User user2 = new User("123-4567", "qwerty", "customer");

        assertEquals(user1, user2);
    }

    @Test
    public void shouldReturnFalseIfObjectDoesNotExist() {
        User user = new User("123-4567", "qwerty", "customer");

        assertNotEquals(user, null);
    }

    @Test
    public void shouldNotBeEqualToAnotherObjectOfADifferentType() {
        User user1 = new User("123-4567", "qwerty", "librarian");
        Book book = new Book("Vilette", "Charlotte Bronte", 1842);

        assertNotEquals(user1, book);
    }

    @Test
    public void shouldBeEqualToUserWithSameLibraryNumber() {
        User user1 = new User("123-4567", "qwerty", "librarian");
        User user2 = new User("123-4567", "qwerty", "customer");

        assertEquals(user1, user2);
    }

    @Test
    public void shouldBeEqualToUserWithSamePasswordWithSameLogin() {
        User user1 = new User("123-4567", "qwerty", "librarian");
        User user2 = new User("123-4567", "qwerty", "librarian");

        assertEquals(user1, user2);
    }

    @Test
    public void shouldBeEqualToItself() {
        User user = new User("123-4567", "qwerty", "customer");

        assertEquals(user, user);
    }

    @Test
    public void shouldReturnSameHashCodeForSameObjects() {
        User user = new User("123-4567", "qwerty", "customer");

        assertEquals(user.hashCode(), user.hashCode());
    }

    @Test
    public void shouldReturnDifferentHashCodeForDifferentObjects() {
        User user1 = new User("123-4567", "qwerty", "librarian");
        User user2 = new User("123-4567", "qwert", "customer");

        assertNotEquals(user1.hashCode(), user2.hashCode());
    }

    @Test
    public void shouldReturnHashCodeAsZeroIfLoginDetailsAreNull() {
        User user = new User(null, null, "guest");

        assertEquals(0, user.hashCode());
    }

    @Test
    public void shouldReturnRoleOfUser() {
        User user = new User("123-4567", "qwerty", "customer");

        assertEquals("customer", user.roleOfUser());
    }

}