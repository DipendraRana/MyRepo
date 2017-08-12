/******************************************************************************
 *  Purpose:Read in the month (m), day (d), and year (y) and print out what
 *          day of the week it falls on according to the Gregorian calendar.
 *          For M use 1 for January, 2 for February, and so forth. Outputs
 *          0 for Sunday, 1 for Monday, and so forth.
 *
 * @author:  Dipendra Rana
 * @version: V1.0
 * @since:   7-8-2017
 ******************************************************************************/

package com.bridgelabz.util;

public class DayOfWeek {
    public static void main(String args[]){
        int day = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int year = Integer.parseInt(args[2]);

        //Calculating the day of the week
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) -2;
        int d0 = (day + x + ((31 * m0) / 12)) % 7;

        switch (d0){
            case 0: System.out.println("SUNDAY");
                    break;
            case 1: System.out.println("Monday");
                    break;
            case 2: System.out.println("TUESDAY");
                    break;
            case 3: System.out.println("WEDNESDAY");
                    break;
            case 4: System.out.println("THURSDAY");
                    break;
            case 5: System.out.println("FRIDAY");
                    break;
            case 7: System.out.println("SATURDAY");
                    break;
        }

    }
}
