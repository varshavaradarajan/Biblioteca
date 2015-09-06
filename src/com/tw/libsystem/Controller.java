//Job of the controller class is to delegate the various operations to be performed.
package com.tw.libsystem;

public class Controller {

    private Factory factory;
    private Display display;

    public void run() {
        DelegateWelcomeMessageToBeDisplayed();
    }

    private void DelegateWelcomeMessageToBeDisplayed() {
        factory = createFactory();
        display = factory.buildDisplay("Welcome to Biblioteca");
        display.displayMessage();
    }

    public Factory createFactory()
    {
        return new Factory();
    }
}
