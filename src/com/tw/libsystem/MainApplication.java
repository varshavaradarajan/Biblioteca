package com.tw.libsystem;

public class MainApplication {

    private Factory factory;
    private Library library;
    private MovieLibrary movieLibrary;
    private Controller controller;
    private OperationsFactory operationsFactory;
    private Session session;

    public static void main(String[] args) {
        MainApplication mainApplication = new MainApplication();
        mainApplication.start();
    }

    public void start() {
        factory = new Factory();
        library = new Library();
        operationsFactory = new OperationsFactory();
        movieLibrary = new MovieLibrary();
        session = new Session(new User("000-0000", "000-0000", "guest"));
        controller = new Controller(factory, library, movieLibrary, operationsFactory, session);
        controller.run();
    }
}
