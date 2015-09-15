//Responsibility of this class is to accept user credentials and communicate with authenticator to authenticate
package com.tw.libsystem;

public class Login implements Operations{

    private String loginMessage = "Invalid username/password.\n";
    private InputView inputView;

    public Login(InputView inputView) {
        this.inputView = inputView;
    }

    @Override
    public String execute() {
        String username = inputView.input();
        return loginMessage;
    }
}
