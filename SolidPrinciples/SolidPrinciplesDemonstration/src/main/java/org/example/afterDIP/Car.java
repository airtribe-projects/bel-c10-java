package org.example.afterDIP;

// Car class now depends on Engine abstraction instead of a specific engine class
public class Car {
    private Engine engine;

    // Constructor injection to pass the specific engine
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        engine.start();  // Use the engine to start the car
    }

    public void stopCar() {
        engine.stop();  // Use the engine to stop the car
    }
}
