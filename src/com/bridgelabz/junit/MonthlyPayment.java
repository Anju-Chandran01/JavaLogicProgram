package com.bridgelabz.junit;

import java.util.Scanner;

public class MonthlyPayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Principal Amount : ");
        double principalAmount = sc.nextDouble();
        System.out.println("Enter The Rate Of Interest : ");
        double interest = sc.nextDouble();
        double r = (interest * 100) / 12;
        System.out.println("Enter The Year : ");
        double Y = sc.nextDouble();
        double n = 12 * Y;
        double monthlyPayment = (principalAmount * r) / (1 - Math.pow(1 + r, -n));
        System.out.println("Your Monthly Payment is :" + monthlyPayment);
        sc.close();
    }
}
