package com.bridgelabz.logical;

import java.util.Scanner;

public class CouponNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coupon number");
        char n = sc.next().charAt(0);
        boolean[] isCollected = new boolean[n];
        int count = 0;
        int distinct = 0;
        while (distinct < n) {
            int value = (int) (Math.random() * n);
            count++;
            if (!isCollected[value]) {
                distinct++;
                isCollected[value] = true;
            }
        }
        /* print the total number of cards collected */
        System.out.println("Coupon code is : " + count);
    }
}
