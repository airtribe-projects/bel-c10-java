package org.airtribe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  static {
    System.out.println("Main class loaded");
  }
  public static void main(String[] args) {

    //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AnnotationBeanConfig.class);
    Car car = applicationContext.getBean(MarutiCar.class);
    Car car2 = applicationContext.getBean(ToyotaCar.class);

    System.out.println(car.hashCode());
    car2.drive();
    car.drive();
  }
}