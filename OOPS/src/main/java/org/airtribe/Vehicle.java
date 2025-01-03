package org.airtribe;

public interface Vehicle {
  public static final String WHEEL_TYPE = "MRF";

  void drive();

  public void start();

  public void stop();


  public default void honk() {
    System.out.println("Honk! Honk!");
  };
}
