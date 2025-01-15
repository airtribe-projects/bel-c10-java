package org.airtribe;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;


public class BeanConfig {

  @Bean
  public Car mycar() {
    Car.print();
    return new Car("xuv", engine1());
  }

  @Bean
  public Car avinashcar() {
    return new Car("sedan", engine2());
  }

  @Bean
  public Engine engine1() {
    return new Engine("marturi", "v8");
  }

  @Bean
  public Engine engine2() {
    return new Engine("v8", "toyota");
  }
}
