package org.example.afterDIP;

public class Driver {
    public static void main(String[] args) {
        // Create a GasEngine and inject it into the Car
        Engine gasEngine = new GasEngine();
        Car carWithGasEngine = new Car(gasEngine);
        carWithGasEngine.startCar();
        carWithGasEngine.stopCar();

        System.out.println("------");

        // Create an ElectricEngine and inject it into the Car
        Engine electricEngine = new ElectricEngine();
        Car carWithElectricEngine = new Car(electricEngine);
        carWithElectricEngine.startCar();
        carWithElectricEngine.stopCar();
    }
}
