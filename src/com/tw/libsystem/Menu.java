//Job of the menu is to return the list of options.
package com.tw.libsystem;

import java.util.ArrayList;

public class Menu {

    private ArrayList<String> menuOptions;

    public Menu(ArrayList<String> menuOptions) {
        this.menuOptions = menuOptions;
    }

    @Override
    public String toString() {
        String options = "";
        for (String choices : menuOptions) {
            options += choices + "\n";
        }
        return options;
    }
}
