/********************************************************************************
 * Purpose: takes a range of number as input and outputs the Prime Numbers
 *          in that range.
 *
 * @author:  Dipendra Rana
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class PrimeNoInRange {

    public static void checkingInRange(int aValue, int bValue) {
        int count;

        for (int i = aValue; i <= bValue; i++) {
            count = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 0 && i != 0 && i != 1) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String args[]) {
        int aValue = Integer.parseInt(args[0]);
        int bValue = Integer.parseInt(args[1]);
        checkingInRange(aValue, bValue);

    }
}