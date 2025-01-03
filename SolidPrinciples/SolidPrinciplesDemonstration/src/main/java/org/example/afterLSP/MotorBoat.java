package org.example.afterLSP;

class MotorBoat extends EnginePoweredVehicle {
    @Override
    public void move() {
        startEngine(); // MotorBoat-specific engine start logic
        System.out.println("MotorBoat is sailing in water using engine power");
    }
}