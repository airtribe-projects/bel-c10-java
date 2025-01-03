package org.example.dip;

public class Driver {
    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car();

        // Start the car
        car.startCar();  // This will use the GasEngine to start

        // Stop the car
        car.stopCar();  // This will use the GasEngine to stop
    }
}