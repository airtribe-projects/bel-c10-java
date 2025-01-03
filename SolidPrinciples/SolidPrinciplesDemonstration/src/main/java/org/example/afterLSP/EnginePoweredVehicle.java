package org.example.afterLSP;

abstract class EnginePoweredVehicle extends Vehicle {
    // Engine start logic shared among engine-powered vehicles
    public void startEngine() {
        System.out.println("Engine started");
    }
}