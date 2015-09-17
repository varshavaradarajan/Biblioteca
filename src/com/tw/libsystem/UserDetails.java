//Job of this class is to return the current user's details.
package com.tw.libsystem;

public class UserDetails implements Operations {

    private Session session;

    public  UserDetails(Session session) {
        this.session = session;
    }
    @Override
    public String execute() {
        return session.currentUserDetails();
    }
}
