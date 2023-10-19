package me.zegit.hackerRank.OneWeekPreparation.Day1;

import java.io.*;

class ResultFizzBuzz {

  /*
   * Complete the 'fizzBuzz' function below.
   *
   * The function accepts INTEGER n as parameter.
   */

  public static void fizzBuzz(int n) {

    if (n < 0 && n > 200000) {
      System.out.println("NONE");
    }

    for (int i = 1; i <= n; i++) {

      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("FizzBuzz");
      }

      if (i % 3 == 0 && i % 5 != 0) {
        System.out.println("Fizz");
      }

      if (i % 3 != 0 && i % 5 == 0) {
        System.out.println("Buzz");
      }

      if (i % 3 != 0 && i % 5 != 0) {
        System.out.println(i);
      }
    }
  }
}

public class FizzBuzz {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    ResultFizzBuzz.fizzBuzz(n);

    bufferedReader.close();
  }
}
