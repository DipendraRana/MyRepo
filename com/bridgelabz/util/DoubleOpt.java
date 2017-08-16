/********************************************************************************
 * Purpose: taking double value and print the following integer operations
 *          a + b *c, a * b + c, c + a / b, and a % b + c
 *
 * @author:  Dipendra Rana
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class DoubleOpt {

    public static void operations(double a, double b, double c) {
        double ans;

        ans = a + b * c;
        System.out.println(a + "+" + b + "*" + c + " = " + ans);

        ans = a * b + c;
        System.out.println(a + "*" + b + "+" + c + " = " + ans);

        ans = c + a / b;
        System.out.println(c + "+" + a + "/" + b + " = " + ans);

        ans = a % b + c;
        System.out.println(a + "%" + b + "+" + c + " = " + ans);
    }

    public static void main(String args[]) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        operations(a, b, c);
    }
}