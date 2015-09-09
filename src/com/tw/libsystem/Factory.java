//Job of the factory class is to instantiate new display objects.
package com.tw.libsystem;

public class Factory {

    private Display display;
    private InputView inputView;
    private Parser parser;

    public Display buildDisplay(String message) {
        display = new Display(message);
        return display;
    }

    public InputView buildInputView() {
        inputView = new InputView();
        return inputView;
    }

    public Parser buildParser(String inputMessage, Library library) {
        parser = new Parser(inputMessage, library);
        return parser;
    }
}
