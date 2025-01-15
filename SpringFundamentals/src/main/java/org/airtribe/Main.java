package org.airtribe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

  static {
    System.out.println("Main class loaded");
  }
  public static void main(String[] args) {

    //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
    Car car = applicationContext.getBean("mycar", Car.class); // object 1
    Car avinashCar = applicationContext.getBean("avinashcar", Car.class); // object 3

    System.out.println(car.hashCode());
    System.out.println(avinashCar.hashCode());
    car.drive();
    avinashCar.drive();
  }
}