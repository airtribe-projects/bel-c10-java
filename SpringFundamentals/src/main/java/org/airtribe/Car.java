package org.airtribe;

public class Car {
  private String carType;
   private Engine engine;

  public Car(String carType, Engine engine) {
    this.carType = carType;
     this.engine = engine;
  }

  public String getCarType() {
    return carType;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setCarType(String carType) {
    this.carType = carType;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  public void drive() {
     engine.start();
    System.out.println("Driving the car " + carType);
  }

  public static void print() {
    System.out.println("Car class");
  }
}
