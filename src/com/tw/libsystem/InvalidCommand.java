//Job of this class is to inform user that he or she has entered a invalid command.
package com.tw.libsystem;

public class InvalidCommand implements Operations {

    private String inputInvalidMessage;

    @Override
    public String toString() {
        inputInvalidMessage =  "Select a valid option!\n";
        return inputInvalidMessage;
    }

    public String execute() {
        return toString();
    }
}
