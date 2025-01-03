package org.airtribe;

public abstract class Car  implements Vehicle, Vehicle2 {

  // data of the class

  String model;

  protected String color;

  protected int numberOfWheels;

  protected int speed;

  public static int count;

  // NO ARG Constructo

  // PARAMETERIZED CONSTRUCTOR
  // 3 ARG CONSTRUCTOR, ALL ARG CONSUTRTOR
  public Car(String model, String color, int numberOfWheels) {
    this.model = model;
    this.color = color;
    this.numberOfWheels = numberOfWheels;
  }

  // 2 ARG CONSTRUCTOR
  // Constructor Overloading

  public Car(String providedModel, String providedColor) {
    this(providedModel, providedColor, 4);
  }

  public Car() {

  }


  public abstract void start();

  public void stop() {
    System.out.println("Car" + model + " is stopping");
  }


  public void setSpeed(int providedSpeed) {
    if (providedSpeed < 0) {
      speed = 0;
      return;
    }
    speed = providedSpeed;
    System.out.println(model);
  }


  public int getSpeed() {
    return speed;
  }

  public int getCount() {
    return count;
  }

  public void incrementCount() {
    System.out.println(model);
    for(int i=0;i<10;i++) {
      System.out.println(i);
    }
    count++;
  }

  public void displayCarDetails(Car car) {
    System.out.println("Model: " + car.model);
    System.out.println("Color: " + car.color);
    System.out.println("Number of Wheels: " + car.numberOfWheels);
  }

  public void displayCurrentCarDetails() {
    displayCarDetails(this);
  }



}
