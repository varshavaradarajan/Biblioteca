//Responsibility of this class is to accept user credentials and communicate with authenticator to authenticate
package com.tw.libsystem;

public class Login implements Operations {

    private String loginMessage = "Invalid username/password.\n";
    private InputView inputView;
    private Authenticator authenticator;
    private Session session;

    public Login(InputView inputView, Authenticator authenticator, Session session) {
        this.inputView = inputView;
        this.authenticator = authenticator;
        this.session = session;
    }

    @Override
    public String execute() {
        String userName = acceptUsernameFromUser();
        String password = acceptPasswordFromUser();
        loginMessage = authenticator.authenticate(userName, password, session);
        System.out.println(session.typeOfUser());
        return loginMessage;
    }

    String acceptPasswordFromUser() {
        return inputView.input();
    }

    String acceptUsernameFromUser() {
        return inputView.input();
    }
}
