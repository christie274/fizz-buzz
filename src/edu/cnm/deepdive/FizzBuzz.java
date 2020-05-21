package edu.cnm.deepdive;

public class FizzBuzz {

  public static void main(String[] args) {
    for (int counter = 1; counter <= 100; counter++) {
      boolean counterIsFizz = (counter % 3 == 0);
      boolean counterIsBuzz = (counter % 5 == 0);
      // If counterIsFizz and counterIsBuzz, print fizzbuzz;
      // otherwise, if counterIs
      if (counterIsFizz && counterIsBuzz) {
        System.out.println("fizzbuzz");
      } else if(counterIsBuzz) {
        System.out.println("buzz");
      } else if (counterIsFizz) {
        System.out.println("fizz");
      } else {
        System.out.println(counter);
      }
    }
  }

  }
