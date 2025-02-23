package org.airtribe.AsyncApiApplication.entity;

import java.util.List;


public class Result {

  private List<Product> products;

  public Result(List<Product> products) {
    this.products = products;
  }

  public Result() {

  }

  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }
}
