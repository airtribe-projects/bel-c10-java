package org.example.afterLSP;

class Bike extends EnginePoweredVehicle {
    @Override
    public void move() {
        startEngine(); // Bike-specific engine start logic
        System.out.println("Bike is driving on the road");
    }
}