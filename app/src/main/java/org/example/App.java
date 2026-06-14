package org.example;

public class App {
  public static void main(String[] args) {
    Oops valid = new Oops();

    int output = valid.getInput(0, 500, "Please enter a value: ", "Your value is invalid");

    System.out.println("The value chosen by the user is " + output);

  }
}
