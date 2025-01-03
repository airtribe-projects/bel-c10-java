package org.example.afterLSP;

public class Main {
    public static void makeVehicleMove(Vehicle vehicle) {
        vehicle.move(); // Polymorphism-based move call
    }

    public static void main(String[] args) {
        // Create different vehicles
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle motorBoat = new MotorBoat();
        Vehicle rowBoat = new RowBoat();

        // Test the vehicles
        makeVehicleMove(car);       // Engine started, Car is driving on the road
        makeVehicleMove(bike);      // Engine started, Bike is driving on the road
        makeVehicleMove(motorBoat); // Engine started, MotorBoat is sailing in water using engine power
        makeVehicleMove(rowBoat);   // RowBoat is being rowed manually
    }
}