//Job of this class is to hold a list of registered users and check if a specified user is present in the registered users list.
package com.tw.libsystem;

import java.util.ArrayList;

public class Authenticator {

    private ArrayList<User> registeredUsers;

    public Authenticator() {
        registeredUsers = new ArrayList<>();
        registeredUsers.add(new User("123-4567", "qwerty", "customer"));
        registeredUsers.add(new User("765-4321", "qwerasdf", "librarian"));
    }

    public String authenticate() {
        return "Invalid username/password.\n";
    }
}
