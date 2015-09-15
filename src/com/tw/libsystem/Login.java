//Responsibility of this class is to accept user credentials and communicate with authenticator to authenticate
package com.tw.libsystem;

public class Login implements Operations{

    private String username, password;
    private String loginMessage = "Invalid username/password.\n";
    private InputView inputView;

    public Login(InputView inputView) {
        this.inputView = inputView;
    }

    @Override
    public String execute() {
        acceptUsernameFromUser();
        acceptPasswordFromUser();
        return loginMessage;
    }

    void acceptPasswordFromUser() {
        password = inputView.input();
    }

    void acceptUsernameFromUser() {
        username = inputView.input();
    }
}
