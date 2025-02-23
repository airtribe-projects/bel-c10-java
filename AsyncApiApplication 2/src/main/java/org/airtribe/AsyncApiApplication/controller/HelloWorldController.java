package org.airtribe.AsyncApiApplication.controller;

import org.airtribe.AsyncApiApplication.entity.Result;
import org.airtribe.AsyncApiApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;


@RestController
public class HelloWorldController {

  @Autowired
  private UserService userService;

  @GetMapping("/hello")
  public String hello() {
    return "Hello world!";
  }

  @GetMapping("/hello2")
  public String hello2() {
    return userService.executeHello();
  }

  @GetMapping("/productsSync")
  public Result productsSync() {
    return userService.fetchProductSync();
  }

  @GetMapping("/productsAsync")
  public Mono<Result> productsAsync() {
    return userService.fetchProductAsync();
  }

  @GetMapping("/productsSync2")
  public Result productsSync2() {
    return userService.fetchProductSyncWithWebClient();
  }
}
