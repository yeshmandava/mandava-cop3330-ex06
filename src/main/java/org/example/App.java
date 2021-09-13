package org.example;
import java.util.Scanner;
import java.util.Calendar;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Yeshwanth Mandava
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print( "What is your current age: " );
        int CurrAge = input.nextInt();

        System.out.print("At what age would you like to retire: ");
        int RetAge = input.nextInt();

        int currYear = Calendar.getInstance().get(Calendar.YEAR);
        int RemainingAge = (RetAge - CurrAge);
        int RetYear = (currYear+RemainingAge);

        System.out.printf("You have %d years left until you can retire. \nIt's %d, so you can retire in %d!", RemainingAge, currYear, RetYear);
        

    }
}
