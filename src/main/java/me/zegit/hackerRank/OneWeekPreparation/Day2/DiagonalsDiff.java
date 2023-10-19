package me.zegit.hackerRank.OneWeekPreparation.Day2;

import java.util.Arrays;
import java.util.List;

public class DiagonalsDiff {

  public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int sumleft = 0;
    int sumright = 0;
    for (int i = 0; i < arr.size(); i++) {
      sumright = sumright + arr.get(i).get(i);
      sumleft = sumleft + arr.get(i).get(arr.size()-1-i);
    }

    int diff=Math.abs(sumright-sumleft);
    return diff;
  }

  public static void main(String[] args) {
    /*
    1 4 7
    2 5 8
    3 6 9
    righ=15
    left=15
     */
    List<List<Integer>> arr =
        Arrays.asList(Arrays.asList(1, 4, 7), Arrays.asList(2, 5, 8), Arrays.asList(3, 6, -10));
    System.out.println(arr);
    System.out.println("The absolute diffrence: "+diagonalDifference(arr));
    ;
  }
}
