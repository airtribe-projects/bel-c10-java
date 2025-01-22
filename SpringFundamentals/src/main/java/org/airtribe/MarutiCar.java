package org.airtribe;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class MarutiCar extends Car {
  public MarutiCar(@Value("${marutiCar.carType}") String carType, Engine engine) {
    super(carType, engine);
  }
}
