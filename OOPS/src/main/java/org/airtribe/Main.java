package org.airtribe;


public class Main {
  public static void main(String[] args) {
      Car car = new ElectricCar("Tesla", "Model S", 2021, 9);
      car.displayCurrentCarDetails();
      car.start();

      Calculator calculator = new Calculator();
      calculator.add(1,2);
      calculator.add(1.2, 2);
  }
}