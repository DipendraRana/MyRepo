/********************************************************************************
 * Purpose: takes a command-line argument n and prints a table of the powers
 *          of 2 that are less than or equal to 2^n.
 *
 * @author:  Dipendra Rana
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class PowerOf2 {
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        for (int i = 0;i <= n;i++)
            System.out.println("2^" + i + " = " + Math.pow(2, i));
    }
}
