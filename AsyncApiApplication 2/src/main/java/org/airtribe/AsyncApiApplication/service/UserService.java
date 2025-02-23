package org.airtribe.AsyncApiApplication.service;

import org.airtribe.AsyncApiApplication.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.SimpleThreadScope;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Service
public class UserService {

  @Autowired
  private RestTemplate _restTemplate;

  @Autowired
  private WebClient _webClient;

  public String executeHello() {
    String result = _restTemplate.getForObject("http://localhost:9002/hello", String.class);
    System.out.println(result);
    return result;
  }

  public Result fetchProductSync() {
    long startTime = System.currentTimeMillis();
    System.out.println("🔵 Sync Request Started... ");
    System.out.println("Sync request is being handled by Thread: " + Thread.currentThread().getName());
    Result result = _restTemplate.getForObject("https://dummyjson.com/products", Result.class);

    System.out.println("✅ Sync Response Received ");

    long endTime = System.currentTimeMillis();
    System.out.println("🕒 Total Time (Sync): " + (endTime - startTime) + "ms");

    for (int i=0;i<10000;i++) {
      // System.out.println("Doing some work in the foreground");
    }
    return result;
  }

  public Mono<Result> fetchProductAsync() {
    long startTime = System.currentTimeMillis();
    System.out.println("🔵 Async Request Started... ");
    System.out.println("Async request is being handled by Thread: " + Thread.currentThread().getName());

    Mono<Result> result = _webClient.get().uri("https://dummyjson.com/products")
        .retrieve()
        .bodyToMono(Result.class)
        .doFirst(() -> System.out.println("📡 Making the async call"))
        .doOnSuccess(res -> System.out.println("✅ Async Response Received Thread Name: " + Thread.currentThread().getName()))
        .doFinally(signalType -> {
          long endTime = System.currentTimeMillis();
          System.out.println("🕒 Total Time (Async): " + (endTime - startTime) + "ms");
        });

    for (int i=0;i<10000;i++) {
      // System.out.println("Doing some work in the foreground");
    }

    return result;

  }

  public Result fetchProductSyncWithWebClient() {
    long startTime = System.currentTimeMillis();
    System.out.println("🔵 Sync Request Started... ");
    System.out.println("Sync request is being handled by Thread: " + Thread.currentThread().getName());

    Result result = _webClient.get().uri("https://dummyjson.com/products")
        .retrieve()
        .bodyToMono(Result.class)
        .block();

    System.out.println("✅ Sync Response Received Thread name : " + Thread.currentThread().getName());
    for (int i=0;i<10000;i++) {
      // System.out.println("Doing some work in the foreground");
    }
    return result;
  }
}
