package com.tw.libsystem;

public class MainApplication {

    public static void main(String[] args) {
        MainApplication mainApplication = new MainApplication();
        mainApplication.start();
    }

    public void start() {
        Factory factory = new Factory();
        Library library = new Library();
        OperationsFactory operationsFactory = new OperationsFactory();
        MovieLibrary movieLibrary = new MovieLibrary();
        Session session = new Session(new User("000-0000", "000-0000", "guest", "defaultUser", "noEmail", "noPhoneNumber"));
        Controller controller = new Controller(factory, library, movieLibrary, operationsFactory, session);
        controller.run();
    }
}
