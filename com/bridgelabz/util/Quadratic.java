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
    public static void main(String args[]){
        double root1,root2;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = sc.nextInt();
        System.out.print("Enter the value of b:");
        int b = sc.nextInt();
        System.out.print("Enter the vale of c:");
        int c = sc.nextInt();

        System.out.println("Your Quadratic equation is: " + a + "x^2+" + b + "x+" + c);

        int delta = ((b * b) - (4 * a * c));

        if(delta > 0){
            System.out.println("There are two real roots");
            root1 = ((-b + Math.sqrt(delta)) / (2 * a));
            root2 = ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Root1 of x=" + root1);
            System.out.println("Root2 of x=" + root2);
        }
        else if (delta == 0){
            System.out.println("There is one real root");
            root1 = ((-b + Math.sqrt(delta)) / (2 * a));
            System.out.println("Root of x=" + root1);
        }
        else {
            System.out.println("There is no real root");
        }
    }
}
