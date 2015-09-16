//Job of this class is to hold the current user so as to use the information across multiple classes.
package com.tw.libsystem;

public class Session {

    private User currentUser;

    public Session(User currentUser) {
        this.currentUser = currentUser;
    }

    public String typeOfUser() {
        return currentUser.roleOfUser();
    }

    public void setUser(User user) {
        currentUser = user;
    }
}
