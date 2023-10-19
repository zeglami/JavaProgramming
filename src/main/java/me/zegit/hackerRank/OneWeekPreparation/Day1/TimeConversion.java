package me.zegit.hackerRank.OneWeekPreparation.Day1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class ResultTimeConversion {

  /*
   * Complete the 'timeConversion' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts STRING s as parameter.
   */

  public static String timeConversionV3(String s) {

    if (s.contains("AM")) {
      s = s.replace("AM", "");
      if (s.substring(0, 2).equals("12")) {
        s = s.replace(s.substring(0, 2), "00");
      }
      return s;
    } else {
      String a = s.substring(0, 2);
      s = s.replace("PM", "");
      if (a.equals("12")) return s;
      else {
        int x = Integer.parseInt(a) + 12;
        String z = Integer.toString(x);
        s = s.replace(a, z);
      }
      return s;
    }
  }

  public static String timeConversionV2(String s) {
    int newhour = 0;
    int hour = Integer.parseInt(s.substring(0, 2));
    String AmPm = s.substring(s.length() - 2);
    s = s.substring(0, 8);
    if (AmPm.equals("AM")) {
      if (hour == 12) {
        s = "00" + s.substring(2, 8);
      }
    } else {
      newhour = hour + 12;
      if (newhour == 24) {
        newhour = 12;
      }
      s = newhour + s.substring(2, 8);
    }

    return s;
  }

  public static String timeConversion(String s) {
    // Write your code here
    String[] sp = s.split(":");
    String newhour = null;
    String hour = s.substring(0, 2);
    String AmPm = s.substring(s.length() - 2);
    Map<String, String> map = new HashMap<String, String>();
    map.put("01", "13");
    map.put("02", "14");
    map.put("03", "15");
    map.put("04", "16");
    map.put("05", "17");
    map.put("06", "18");
    map.put("07", "19");
    map.put("08", "20");
    map.put("09", "21");
    map.put("10", "22");
    map.put("11", "23");
    map.put("12", "12");
    s = s.substring(0, 8);
    if (AmPm.equals("AM")) {
      if (hour.equals("12")) {
        s = "00" + s.substring(2, 8);
      }
    } else {
      newhour = map.get(hour);
      s = newhour + s.substring(2, 8);
    }

    return s;
  }
}

public class TimeConversion {
  public static void main(String[] args) throws IOException {
    String test = "01:00:00AM";
    System.out.println(ResultTimeConversion.timeConversion(test));
    test = "12:00:00AM";
    System.out.println(ResultTimeConversion.timeConversion(test));
    test = "10:00:00PM";
    System.out.println(ResultTimeConversion.timeConversion(test));
    test = "12:00:00PM";
    System.out.println(ResultTimeConversion.timeConversion(test));
    System.out.println("------------V2----------------");
    test = "01:00:00AM";
    System.out.println(ResultTimeConversion.timeConversionV2(test));
    test = "12:00:00AM";
    System.out.println(ResultTimeConversion.timeConversionV2(test));
    test = "10:00:00PM";
    System.out.println(ResultTimeConversion.timeConversionV2(test));
    test = "12:00:00PM";
    System.out.println(ResultTimeConversion.timeConversionV2(test));


    System.out.println("------------V3----------------");
    test = "01:00:00AM";
    System.out.println(ResultTimeConversion.timeConversionV3(test));
    test = "12:00:00AM";
    System.out.println(ResultTimeConversion.timeConversionV3(test));
    test = "10:00:00PM";
    System.out.println(ResultTimeConversion.timeConversionV3(test));
    test = "12:00:00PM";
    System.out.println(ResultTimeConversion.timeConversionV3(test));
  }
}
