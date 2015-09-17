//Job of this class is to return the current user's details.
package com.tw.libsystem;

public class UserDetails implements Operations {

    private Session session;

    public  UserDetails(Session session) {
        this.session = session;
    }
    @Override
    public String execute() {
        String details = String.format("%-25s %-25s %s\n", "Name", "Email", "Phone Number");
        details += session.currentUserDetails();
        return details;
    }
}
