package com.bridgelabz.junit;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        double f, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice for conversion \n 1.Fahrenheit To Celsius \n 2.Celsius To Fahrenheit");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter Temperature in °F : ");
                f = sc.nextDouble();
                c = (f - 32) * 5 / 9;
                System.out.println("The Temperature in celsius scale is :" +c+ "°C");
                break;
            case 2:
                System.out.println("Enter Temperature in °C : ");
                c = sc.nextDouble();
                f = (c * 9) / 5 + 32 ;
                System.out.println("The Temperature in fahrenheit scale is :" +f+ "°F");
                sc.close();
        }
    }
}
