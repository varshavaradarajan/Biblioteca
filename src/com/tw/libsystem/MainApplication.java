package com.tw.libsystem;

public class MainApplication {

    private Factory factory;
    private Library library;
    private Controller controller;

    public static void main(String[] args) {
        MainApplication mainApplication = new MainApplication();
        mainApplication.start();
    }

    public void start() {
        factory = new Factory();
        library = new Library();
        controller = new Controller(factory, library);
        controller.run();
    }
}
