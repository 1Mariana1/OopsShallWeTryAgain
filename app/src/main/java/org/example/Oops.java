package org.example;
import java.util.Scanner;

public class Oops {
  public int getInput(int lowerBound, int upperBound, String promptUser, String errorMessage) {
  Scanner scanner = new Scanner(System.in);

  int value;

  while (true) {
    System.out.println(promptUser);

    if (!scanner.hasNextInt()) {
      System.out.println(errorMessage);
      scanner.next();
      continue;
    }

    value = scanner.nextInt();

    if (value >= lowerBound && value <= upperBound) {
      return value;
    }

    System.out.println(errorMessage);

  }

  }
}
