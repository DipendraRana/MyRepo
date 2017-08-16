/********************************************************************************
 * Purpose: given the temperature in fahrenheit as input outputs the temperature
 *          in Celsius or viceversa using the formula
 *
 * @author: Dipendra Rana
 * @version: V1.0
 * @since: 7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

import java.util.Scanner;

public class TemperatureConversion {

    private static double celsius;

    private static double fahrenheit;

    static Scanner sc = new Scanner(System.in);

    public static void fahrenheit() {

        System.out.print("Enter the temperature in celsius:");
        celsius = sc.nextDouble();
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("The temperature is " + fahrenheit + "F for given temperature in " + celsius + "C");
    }

    public static void celsius() {
        System.out.print("Enter the temperature in fahrenheit:");
        fahrenheit = sc.nextDouble();
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("The temperature is " + celsius + "C for given temperature in " + fahrenheit + "F");
    }

    public static void main(String args[]) {
        System.out.print("The value you entered is in celsius/fahrenheit(c/f):");
        String t = sc.next();
        switch (t) {
            case "c":
                fahrenheit();
                break;

            case "f":
                celsius();
                break;

        }
    }
}