package com.tw.libsystem;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MenuTest {

    @Test
    public void shouldReturnAListOfOptions() {
        ArrayList<String> menuOptions = new ArrayList<String>();
        menuOptions.add("1. List Books");
        Menu menu = new Menu(menuOptions);

        assertEquals("1. List Books\n", menu.toString());
    }
}