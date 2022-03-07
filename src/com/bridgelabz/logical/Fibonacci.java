package com.bridgelabz.logical;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner no = new Scanner(System.in);

        System.out.println("Enter the required no: of terms : ");
        int num = no.nextInt();
        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("Fibonacci Series till " + num + " terms:");

        for (int i = 1; i <= num; ++i) {
            System.out.print(firstTerm + ", ");

            // COMPUTE THE NEXT TERM
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
