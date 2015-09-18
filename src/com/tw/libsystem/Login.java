//Responsibility of this class is to accept user credentials and communicate with authenticator to authenticate
package com.tw.libsystem;

public class Login implements Operations {

    private String loginMessage = "Invalid username/password.\n";
    private InputView inputView;
    private Authenticator authenticator;
    private Session session;
    private Factory factory;

    public Login(InputView inputView, Authenticator authenticator, Session session, Factory factory) {
        this.inputView = inputView;
        this.authenticator = authenticator;
        this.session = session;
        this.factory = factory;
    }

    @Override
    public String execute() {
        Display display = factory.buildDisplay("Enter Library Number:");
        display.displayMessage();
        String userName = acceptUsernameFromUser();
        display = factory.buildDisplay("Enter Password:");
        display.displayMessage();
        String password = acceptPasswordFromUser();
        loginMessage = authenticator.authenticate(userName, password, session);
        return loginMessage;
    }

    String acceptPasswordFromUser() {
        return inputView.input();
    }

    String acceptUsernameFromUser() {
        return inputView.input();
    }
}
