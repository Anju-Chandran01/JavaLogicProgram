package com.bridgelabz.logical;

import java.util.Scanner;

public class PerfectNumber {

    // CHECK PERFECT OR NOT
    static long isPerfect(long num)
    {
        long sum=0;
        for(int i=1; i <= num/2; i++)
        {
            if(num % i == 0)
                sum=sum + i;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        long number, s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        number=sc.nextLong();
        s = isPerfect(number);  //FUNCTION CALL
        if(s==number)   //COMPARE SUM TO NUMBER
            System.out.println(number+" is a perfect number");
        else
            System.out.println(number+" is not a perfect number");
    }
}
