/********************************************************************************
 * Purpose:  Compute sin x using the Taylor series expansions
 *
 * @author: Dipendra Rana
 * @version: V1.0
 * @since: 7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class Sin {

    public static void computation(double xValue) {
        int b = (int) xValue;
        xValue = xValue % (2 * Math.PI);
        double sinvalue = xValue - Math.pow(xValue, 3) / factorial(3) + Math.pow(xValue, 5) / factorial(5) -
                Math.pow(xValue, 7) / factorial(7);
        System.out.println("Sin " + b + " = " + sinvalue);
    }

    public static int factorial(int a) {
        if (a == 1)
            return 1;
        else
            return a = a * factorial(a - 1);
    }

    public static void main(String args[]) {
        double x = Integer.parseInt(args[0]);

    }
}