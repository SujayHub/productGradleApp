/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.img.learn.gradle;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    System.out.println(
        Product.builder()
            .name("MacBook")
            .description("16 inch Macbook from Apple")
            .price(1599)
            .build()
            .toString());
  }
}
