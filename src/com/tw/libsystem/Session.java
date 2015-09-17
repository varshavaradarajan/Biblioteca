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

    public void setUser() {
        currentUser = new User("000-0000", "000-0000", "guest", "defaultUser", "noEmail", "noPhoneNumber");
    }

    public String currentUserDetails() {
        String details = String.format("%-25s %-25s %s\n", "Name", "Email", "Phone Number");
        details += currentUser.toString();
        return details;
    }
}
