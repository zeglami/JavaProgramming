package me.zegit.hackerRank.OneWeekPreparation.Day1;

import java.io.*;

import java.util.*;

/*
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero.
 */
class ResultPlusMinus {

  /*
   * Complete the 'plusMinus' function below.
   *
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  public static void plusMinus(List<Integer> arr) {

    // Write your code here

    int len = arr.size();
    int positif = 0;
    int negtif = 0;
    int zero = 0;
    // Case where the array is null
    if (len == 0 || arr == null) {
      len = 1;
    }
    // Rules for the array
    if (len > 100) {
      System.out.println("len should be less than 100");
      //return [0,0,0]
    }


    for (int i = 0; i < len; i++) {
      if(arr.get(i)>1001){
        System.out.println("The values inside the array should be less than 100");
        //return [0,0,0]
      }
      if (arr.get(i) == 0) {
        zero = zero + 1;
      } else if (arr.get(i) > 0) {
        positif = positif + 1;
        //
      } else {
        negtif = negtif + 1;
      }
    }

    System.out.println((double) positif / len);
    System.out.println((double) negtif / len);
    System.out.println((double) zero / len);
    //return [(double) positif / len,(double) negtif / len,(double) zero / len]
  }
}

public class PlusMinus {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    List<Integer> arr = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int arrItem = Integer.parseInt(arrTemp[i]);
      arr.add(arrItem);
    }

    ResultPlusMinus.plusMinus(arr);

    bufferedReader.close();
  }
}
