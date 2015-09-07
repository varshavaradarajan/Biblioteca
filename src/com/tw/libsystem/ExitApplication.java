//Job of this class is to exit the application whenever user chooses the option.
package com.tw.libsystem;

public class ExitApplication implements Operations {

    private String exitMessage;

    @Override
    public String toString() {
        return "Thank You!\n";

    }

    @Override
    public String execute() {
        exitMessage = toString();
        System.exit(0);
        return exitMessage;
    }
}
