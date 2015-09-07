package com.tw.libsystem;

public class MainApplication {

    private Factory factory;
    private Controller controller;

    public static void main(String[] args) {
        MainApplication mainApplication = new MainApplication();
        mainApplication.start();
    }

    public void start() {
        factory = new Factory();
        controller = new Controller(factory);
        controller.run();
    }
}
