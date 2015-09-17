//Job of this class is to change the current session to guest session.
package com.tw.libsystem;

public class Logout implements Operations {

    private Session session;

    public Logout(Session session) {
        this.session = session;
    }

    @Override
    public String execute() {
        session.setUser();
        return "Successfully logged out.\n";
    }
}
