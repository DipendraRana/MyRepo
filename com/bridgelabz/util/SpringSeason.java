/********************************************************************************
 * Purpose: takes two int values m and d from the command line and prints true
 *          if day d of month m is between March 20 (m = 3, d = 20) and June 20
 *          (m = 6, d = 20), false otherwise.
 *
 * @author: Dipendra Rana
 * @version: V1.0
 * @since: 7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class SpringSeason {

    public static void main(String args[]) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        boolean isSpringSeason = ((m == 3 && (d >= 20 && d <= 31))
                || (m == 4 && (d >= 1 && d <= 30))
                || (m == 5 && (d >= 1 && d <= 31))
                || (m == 6 && (d >= 1 && d <= 20)));
        System.out.println(isSpringSeason);
    }
}