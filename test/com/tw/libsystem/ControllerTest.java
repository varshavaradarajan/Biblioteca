package com.tw.libsystem;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ControllerTest {

    @Test
    public void shouldDelegateWelcomeMessageToBeDisplayed() {
        Display display = mock(Display.class);
        Controller controller = new Controller(display);

        controller.run();

        verify(display).displayMessage();
    }

}