//Job of the factory class is to instantiate new display objects.
package com.tw.libsystem;

public class Factory {

    private Display display;

    public Display buildDisplay(String message) {
        display = new Display(message);
        return display;
    }
}
