package com.tw.libsystem;

import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerTest {

    @Test
    public void shouldCreateAFactoryForManufacturingDisplays() {
        Controller controller = new Controller();

        assertEquals(Factory.class, controller.createFactory().getClass());
    }

}