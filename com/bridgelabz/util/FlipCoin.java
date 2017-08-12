/********************************************************************************
 * Purpose:  To simulate a coin flip and print out "Heads" or "Tails" accordingly
 *           and finally print the percentage of Head vs Tail.
 *
 * @author:  Dipendra Rana
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class FlipCoin {
    public static void main(String args[]){
        double coin = Math.random();
        if(coin >= 0.5)
            System.out.println("It is Head with 50% chance of being Head");
        else
            System.out.println("It is Tail with 50% chance of being Tail");
    }
}
