/********************************************************************************
 * Purpose: Takes a year as input and outputs the Year is a Leap Year or not
 *          a Leap Year.
 *
 * @author:  Dipendra Rana
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class LeapYear {
    public static void georgianCal(int year) {
        boolean isLeapYear = (((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0));
        if (year >= 1582) {
            if (isLeapYear)
                System.out.println("The Year you entered " + year + " is Leap Year");
            else
                System.out.println("The Year you entered " + year + " is not Leap Year");
        } else
            System.out.println("The Year entered " + year + " is not corresponding to Gergorian calender");

    }

    public static void main(String args[]) {
        int year = Integer.parseInt(args[0]);
        georgianCal(year);
    }
}