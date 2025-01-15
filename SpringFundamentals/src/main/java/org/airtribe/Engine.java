package org.airtribe;

public class Engine {
  private String engineType;
  private String engineMake;

  public Engine(String engineType, String engineMake) {
    this.engineType = engineType;
    this.engineMake = engineMake;
  }

  public String getEngineType() {
    return engineType;
  }

  public String getEngineMake() {
    return engineMake;
  }

  public void setEngineType(String engineType) {
    this.engineType = engineType;
  }

  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }

  public void start() {
    System.out.println("Starting the engine " + engineType + " from " + engineMake);
  }
}
