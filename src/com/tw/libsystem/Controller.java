package com.tw.libsystem;

public class Controller {

    private Display display;

    public Controller(Display display){
        this.display = display;
    }

    public void run() {
        display.displayMessage();

    }

}
