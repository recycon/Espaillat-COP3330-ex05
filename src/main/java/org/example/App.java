package org.example;
import java.util.Scanner;
/**
 * What is the first number? 10
 * What is the second number? 5
 * 10 + 5 = 15
 * 10 - 5 = 5
 * 10 * 5 = 50
 * 10 / 5 = 2
 *
 */

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mario Espaillat
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        System.out.println( "What is the first number? " );
        int x= in.nextInt();
        System.out.println( "What is the second number? " );
        int y= in.nextInt();
        System.out.println(x + " + "+ y+  " = "+ (x+y));
        System.out.println(x + " - "+ y+  " = "+ (x-y));
        System.out.println(x + " * "+ y+  " = "+ (x*y));
        System.out.println(x + " / "+ y+  " = "+ (x/y));
    }
}
