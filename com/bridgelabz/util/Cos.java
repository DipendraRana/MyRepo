/********************************************************************************
 * Purpose:  Compute cos x using the Taylor series expansions
 *
 * @author:  Dipendra Rana
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class Cos {

    public static void computation(double xValue) {
        int copyOfX = (int) xValue;
        xValue = xValue % (2 * Math.PI);
        double cosvalue = 1 - Math.pow(xValue, 2) / factorial(2) + Math.pow(xValue, 4) / factorial(4)
                - Math.pow(xValue, 6) / factorial(6);
        System.out.println("Cos " + copyOfX + " = " + cosvalue);
    }

    public static int factorial(int a) {
        if (a == 1)
            return 1;
        else
            return a = a * factorial(a - 1);
    }

    public static void main(String args[]) {
        double xValue = Integer.parseInt(args[0]);
        computation(xValue);
    }
}