package org.airtribe;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class ToyotaCar extends Car {
  public ToyotaCar(@Value("${toyotaCar.carType}") String carType, Engine engine) {
    super(carType, engine);
  }
}
