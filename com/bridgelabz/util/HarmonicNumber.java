/********************************************************************************
 * Purpose: takes a command-line argument n and prints the nth harmonic number
 *
 * @author: Dipendra Rana
 * @version: V1.0
 * @since: 7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class HarmonicNumber {
    public static void main(String args[]) {
        double harmonic = 0;
        int n = Integer.parseInt(args[0]);

        for (double i = 1; i <= n; i++)
            harmonic = harmonic + (1 / i);

        System.out.println(harmonic);
    }
}
