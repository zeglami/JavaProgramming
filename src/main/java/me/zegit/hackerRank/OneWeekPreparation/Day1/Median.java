package me.zegit.hackerRank.OneWeekPreparation.Day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Median {
  public static double calculateMedian(List<Integer> values) {


      Collections.sort(values);

      if (values.size() % 2 == 1)
        return values.get((values.size() + 1) / 2 - 1);
      else {
        double lower = values.get(values.size() / 2 - 1);
        double upper = values.get(values.size() / 2);

        return (lower + upper) / 2.0;
      }

  }



  public static void main(String[] args) {
    //Testin the function
    List<Integer> list1 = Arrays.asList(1, 2, 3, 5, 4, 7, 9); // 7 element
    System.out.println("Median of first list: " + calculateMedian(list1));

    List<Integer> list2 = Arrays.asList(1, 11, 2, 3, 5, 4, 7, 10); // 8 element
    System.out.println("Median of first list: " + calculateMedian(list2));
  }
}
