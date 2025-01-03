package org.airtribe;

public class Calculator {
  int result;

  public Calculator() {
    result = 0;
  }

  // 1.2,2
//  public int add(int a, int b) {
//    result = a + b;
//    return result;
//  }

  public int add(double a, double b) {
    result = (int) (a + b);
    return result;
  }

  // 1.0, 2.0
  public double add(double a, int b) {
    return a+b;
  }
//
//  public double add(int a, double b) {
//    return a+b;
//  }
}
class Duck {
  FlyingBehavipour flyingBehavipour;
  QuackBehaviour quackBehaviour;

}

FlyingBehaviour behaviour = new HighFly();
EatingBehaviour _behaviour = new TestEat();
Duck duck = new FlyingDuck(behaviour);