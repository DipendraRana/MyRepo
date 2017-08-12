/********************************************************************************
 * Purpose: that prints the sum of two random integers between 1 and 6 (such as
 *          you might get when rolling dice)
 *
 * @author:  Dipendra Rana
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

import java.util.Random;

public class SumOfTwoDice {
    public static void main(String args[]){
        Random rn = new Random();

        int dice1 = rn.nextInt(6) + 1;
        int dice2 = rn.nextInt(6) + 1;

        System.out.println("The sum of the value from two dice is:" + dice1 + dice2);
    }
}
