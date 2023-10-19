package me.zegit.testingOnly;

import java.util.*;

public class MacaronOrder {



    private static int getDiscountedPrice(int unitPrice, int flavors) {
        double discountRate = 0;

        switch (flavors) {
            case 2:
                discountRate = 0.1;
                break;
            case 3:
                discountRate = 0.2;
                break;
            case 4:
                discountRate = 0.3;
                break;
            case 5:
                discountRate = 0.4;
                break;
            default:
                break;
        }

        double discountedPrice = unitPrice * flavors * (1 - discountRate);
        return (int) discountedPrice;
    }

    public static int computeTotalPrice(int unitPrice, String[] macarons) {
        int totalPrice = 0;
        Map<String, Integer> flavorCount = new HashMap<>();

        for (String macaron : macarons) {
            flavorCount.put(macaron, flavorCount.getOrDefault(macaron, 0) + 1);
        }

        for (int count : flavorCount.values()) {
            int sets = count / 5;
            int remainder = count % 5;

            totalPrice += sets * getDiscountedPrice(unitPrice, 5);
            totalPrice += getDiscountedPrice(unitPrice, remainder);
        }

        return totalPrice;
    }


    public static void main(String[] args) {
        int unitPrice = 1;
        String[] macarons = {"Vanilla", "Apple", "Peach","Banana","Cherry"};

        int totalPrice = computeTotalPrice(unitPrice, macarons);
        System.out.println("Total Price: " + totalPrice);
    }
}

