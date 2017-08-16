/********************************************************************************
 * Purpose: compute the square root of a nonnegative number c given in the input
 *          using Newton's method
 *
 * @author: Dipendra Rana
 * @version: V1.0
 * @since: 7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class Sqrt {

    public static void main(String args[]) {
        double c = Double.parseDouble(args[0]);

        double t = c;
        double epsilon = 1e-15;
        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2;
        }
        System.out.println(t);
    }
}