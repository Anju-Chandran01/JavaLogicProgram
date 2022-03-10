package com.bridgelabz.junit;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Decimal Number : ");
        int decimal = sc.nextInt();
        toBinary(decimal);
        sc.close();
    }
    public static void toBinary(int n) {
        int[] binaryValue = new int[20];
        int i = 0;
        while (n > 0) {
            binaryValue[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryValue[j]);
        }
    }
}
