package org.airtribe;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Engine1 extends Engine {
  public Engine1(@Value("${engine1.engineType}") String engineType, @Value("${engine1.engineMake}") String engineMake) {
    super(engineType, engineMake);
  }
}
