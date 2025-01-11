package org.example.afterLSP;

class Car extends EnginePoweredVehicle {
    @Override
    public void move() {
        startEngine(); // Car-specific engine start logic
        System.out.println("Car is driving on the road");
    }
}