package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExitApplicationTest {


    @Test
    public void shouldExitApplicationUponExecutionOfThisCommand() {
        ExitApplication exitApplication = new ExitApplication();

        assertEquals("Thank You!\n", exitApplication.toString());
    }

}