package me.zegit.hackerRank.OneWeekPreparation.Day2;


import java.util.*;

public class LonelyInteger {

    public static int lonelyinteger(List<Integer> arr) {
        Collections.sort(arr);
        HashSet<Integer> arrSet = new HashSet<Integer>();

        for(Integer i : arr){
            if(arrSet.contains(i)){
                arrSet.remove(i);
       // System.out.println(arrSet);
            }else{
                arrSet.add(i);
          //      System.out.println(arrSet);
            }
        }
        Iterator<Integer> it = arrSet.iterator();
        while(it.hasNext()) {
            System.out.println("Element: "+it.next());
        }

        return arrSet.iterator().next();

    }

    public static int duplicateinteger(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        int element=0;
    for (int i = 0; i < arr.size()-1; i++) {
      //
        if(arr.get(i)==arr.get(i+1)){
            element=arr.get(i);
        }
    }

        return element;
    }

  public static void main(String[] args) {
    //
      List<Integer> arr= Arrays.asList(1,3,2,4,1);
    System.out.println("The duplicate number: "+duplicateinteger(arr));
    arr= Arrays.asList(1,3,2,3,4,4,1);
    System.out.println("The unique number: "+lonelyinteger(arr));
  }
}
