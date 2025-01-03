package org.example.lsp;

public class Main {
    public static void makeVehicleMove(Vehicle vehicle) {
        vehicle.startEngine(); // Starts the engine
        vehicle.move();        // Moves the vehicle
    }

    public static void main(String[] args) {
        // Substituting base class objects with derived class objects
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle rowBoat = new RowBoat();

        makeVehicleMove(car);      // Works: Car starts its engine and moves
        makeVehicleMove(bike);     // Works: Bike starts its engine and moves
        makeVehicleMove(rowBoat);  // Fails: Throws UnsupportedOperationException
    }
}