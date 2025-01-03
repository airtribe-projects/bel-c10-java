package org.airtribe;

public class ElectricCar extends Car {
  public int batteryCapacity;

  public int model;

  public ElectricCar(String model, String color, int numberOfWheels, int batteryCapacity) {
//    super(model, color, numberOfWheels);
    super.model = model;
    this.numberOfWheels = numberOfWheels;
    this.batteryCapacity = batteryCapacity;
  }

  public ElectricCar() {

  }

  @Override
  public void drive() {
    System.out.println("Electric car is driving");
  }

  public void start() {
    System.out.println("Electric car started");
  }

  public void displayCurrentCarDetails() {
    super.displayCurrentCarDetails();
    System.out.println("Battery capacity: " + batteryCapacity);
  }

  @Override
  public void drive2() {

  }
}
