package com.bridgelabz.junit;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Non-Negative Number : ");
        double c = sc.nextDouble();
        double epsilon = 1.0e-15;
        double t = c;
        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2.0;
        }
        System.out.println("The Square Root of The Number is : " + t);
        sc.close();
    }
}
