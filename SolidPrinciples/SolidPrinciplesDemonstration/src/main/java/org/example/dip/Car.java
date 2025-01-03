package org.example.dip;

public class Car {
    private GasEngine engine;

    public Car() {
        engine = new GasEngine();  // Car directly creates an instance of GasEngine
    }

    public void startCar() {
        engine.start();
    }

    public void stopCar() {
        engine.stop();
    }
}