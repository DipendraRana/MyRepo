/********************************************************************************
 * Purpose: that prints five uniform random values between 0 and 1, their average
 *          value, and their minimum and maximum value.
 *
 * @author: Dipendra Rana
 * @version: V1.0
 * @since: 7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class Stats5 {

    private static double no1, no2, no3, no4, no5;

    public static void randomOperation() {
        no1 = Math.random();
        no2 = Math.random();
        no3 = Math.random();
        no4 = Math.random();
        no5 = Math.random();

        System.out.println("number1 = " + no1);
        System.out.println("number2 = " + no2);
        System.out.println("number3 = " + no3);
        System.out.println("number4 = " + no4);
        System.out.println("number5 = " + no5);

        double average = (no1 + no2 + no3 + no4 + no5) / 5;
        System.out.println("Average is " + average);

        double min = Math.min(no1, Math.min(no2, Math.min(no3, Math.min(no4, no5))));
        double max = Math.max(no1, Math.max(no2, Math.max(no3, Math.max(no4, no5))));

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }

    public static void main(String args[]) {
        randomOperation();
    }
}