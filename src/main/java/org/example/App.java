/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jack Nelson
 */

package org.example;
import java.math.BigDecimal;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        String str1 = sc.nextLine();
        System.out.print("Enter the rate of interest: ");
        String str2 = sc.nextLine();
        System.out.print("Enter the number of years: ");
        String str3 = sc.nextLine();
        Double n1 = Double.parseDouble(str1);
        Double n2 = Double.parseDouble(str2);
        Double n3 = Double.parseDouble(str3);
        n2 = n2/100;
        Double n4 = n1*(1+n2*n3);
        System.out.printf("After %s years at %s, the investment will be worth $%.2f",str3,str2,n4);
    }
}