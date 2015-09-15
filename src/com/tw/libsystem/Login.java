//Responsibility of this class is to accept user credentials and communicate with authenticator to authenticate
package com.tw.libsystem;

public class Login implements Operations{

    private String loginMessage = "Invalid username/password.\n";
    @Override
    public String execute() {
        return loginMessage;
    }
}
