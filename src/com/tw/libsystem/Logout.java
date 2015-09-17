//Job of this class is to change the current session to guest session.
package com.tw.libsystem;

public class Logout implements Operations {

    private String logOutMessage;

    @Override
    public String execute() {
        return "Successfully logged out.\n";
    }
}
