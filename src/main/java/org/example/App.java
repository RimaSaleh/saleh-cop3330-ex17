/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rima Saleh
 */

package org.example;

//import statement for scanner
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {

        //scanner used to read data inputted
        Scanner scanner = new Scanner(System.in);

        //initializing doubles for bac (for men and women)
        double bacW, bacM;

        //print statement asking for gender to be inputted
        System.out.println("Enter a 1 is you are male or a 2 if you are female:");
        int gender = scanner.nextInt();

        //print statement asking for ounces to be inputted
        System.out.println("How many ounces of alcohol did you have?");
        int ounces = scanner.nextInt();

        //print statement asking for weight to be inputted
        System.out.println("What is your weight, in pounds?");
        int weight = scanner.nextInt();

        //print statement asking for hours to be inputted
        System.out.println("How many hours has it been since your last drink?");
        int hours = scanner.nextInt();

        //if statement if male (calculates BAC)
        if (gender == 1) {
            bacM = (ounces * 5.14 / weight * 0.73) - (.015 * hours);

            System.out.format("Your BAC is %f\n", bacM);


            if (bacM < 0.08)
                System.out.println("It is legal for you to drive.");

            else
                System.out.println("It is not legal for you to drive.");
        }


        //if statement if female (calculates BAC)
        if (gender == 2) {
            bacW = (ounces * 5.14 / weight * 0.66) - (.015 * hours);

            System.out.format("Your BAC is %f\n", bacW);


            if (bacW < 0.08)
                System.out.println("It is legal for you to drive.");


            else
                System.out.println("It is not legal for you to drive.");


        }
    }
}