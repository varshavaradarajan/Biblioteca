//Job of the Input_view is to take in the user input.
package com.tw.libsystem;

import java.util.Scanner;

public class InputView {

    String inputCommand;

    public String input() {
        Scanner scanner = new Scanner(System.in);
        inputCommand = scanner.next();
        return inputCommand;
    }
}
