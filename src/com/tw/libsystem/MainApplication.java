package com.tw.libsystem;

public class MainApplication {

    private Factory factory;
    private Library library;
    private MovieLibrary movieLibrary;
    private Controller controller;
    private OperationsFactory operationsFactory;

    public static void main(String[] args) {
        MainApplication mainApplication = new MainApplication();
        mainApplication.start();
    }

    public void start() {
        factory = new Factory();
        library = new Library();
        operationsFactory = new OperationsFactory();
        movieLibrary = new MovieLibrary();

        controller = new Controller(factory, library, movieLibrary, operationsFactory);
        controller.run();
    }
}
