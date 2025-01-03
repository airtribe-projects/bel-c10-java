package org.example.afterDIP;

// Concrete class that implements the Engine interface
public class GasEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Gas engine started");
    }

    @Override
    public void stop() {
        System.out.println("Gas engine stopped");
    }
}
