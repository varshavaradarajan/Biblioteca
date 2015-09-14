package com.tw.libsystem;

import org.junit.Rule;
import org.junit.Test;
//import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import static org.junit.Assert.*;

public class ExitApplicationTest {

//    @Rule
//    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void shouldExitApplicationUponExecutionOfThisCommand() {
        ExitApplication exitApplication = new ExitApplication();

        assertEquals("Thank You!\n", exitApplication.toString());
    }

//    @Test
//    public void shouldExitFromTheApplication() {
//        ExitApplication exitApplication = new ExitApplication();
//        exit.expectSystemExitWithStatus(0);
//
//        exitApplication.execute();
//    }


}