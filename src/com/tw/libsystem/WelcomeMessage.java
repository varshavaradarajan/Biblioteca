package com.tw.libsystem;

public class WelcomeMessage {

    private String message;

    public WelcomeMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        message = message + "\n";
        return message;
    }
}
