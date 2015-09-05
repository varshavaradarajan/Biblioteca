//Job of display is to display any message that has been given to it.
package com.tw.libsystem;

public class Display {

    private String message;

    Display(String message) {
        this.message = message;
    }

    public void displayMessage() {
        System.out.println(message);
    }
}
