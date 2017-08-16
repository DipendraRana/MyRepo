/********************************************************************************
 * Purpose: find the roots of the equation a*x*x + b*x + c. Since the equation
 *          is x*x, hence there are 2 roots.
 *
 * @author: Dipendra Rana
 * @version: V1.0
 * @since: 7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

import java.util.Scanner;

public class Quadratic {

    private static double delta;

    public static void root(int aValue, int bValue, int cValue) {
        double root1, root2;
        System.out.println("Your Quadratic equation is: " + aValue + "x^2+" + bValue + "x+" + cValue);

        delta = ((bValue * bValue) - (4 * aValue * cValue));

        if (delta > 0) {
            System.out.println("There are two real roots");
            root1 = ((-bValue + Math.sqrt(delta)) / (2 * aValue));
            root2 = ((-bValue - Math.sqrt(delta)) / (2 * aValue));
            System.out.println("Root1 of x=" + root1);
            System.out.println("Root2 of x=" + root2);
        } else if (delta == 0) {
            System.out.println("There is one real root");
            root1 = ((-bValue + Math.sqrt(delta)) / (2 * aValue));
            System.out.println("Root of x=" + root1);
        } else {
            System.out.println("There is no real root");
        }
    }

    public static void main(String args[]) {
        int aValue, bValue, cValue;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a:");
        aValue = sc.nextInt();
        System.out.print("Enter the value of b:");
        bValue = sc.nextInt();
        System.out.print("Enter the vale of c:");
        cValue = sc.nextInt();

        root(aValue, bValue, cValue);
    }
}