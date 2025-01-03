package org.example.afterDIP;

// Another concrete class that implements the Engine interface
public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric engine started");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stopped");
    }
}
