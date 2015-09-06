//Job of the controller class is to delegate the vrious operations to be performed.
package com.tw.libsystem;

public class Controller {

    private Factory factory;

    public void run() {
        factory = createFactory();
    }

    public Factory createFactory()
    {
        return new Factory();
    }
}
