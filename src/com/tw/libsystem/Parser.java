//Job of the parser id to covert the user input into a concrete operation.
package com.tw.libsystem;

public class Parser {

    String inputCommand;

    public Parser(String inputCommand) {
        this.inputCommand = inputCommand;
    }

    public boolean parse() {
        if(inputCommand.isEmpty() == false && inputCommand.length() == 1) {
            return true;
        }
        return false;
    }

}
