/********************************************************************************
 * Purpose:  generates the result of rolling a fair six-sided die
 *          (an integer between 1 and 6). Repeat the Die Roll n times and suggest
 *          which number between 1 and 6 fall maximum number of times.
 *
 * @author: Dipendra Rana
 * @version: V1.0
 * @since: 7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

import java.util.Random;

public class RollDie {

    public static void rollDie(int times) {
        int dice[] = new int[times];
        int countingArray[] = new int[6];

        Random rd = new Random();
        for (int i = 0; i < times; i++) {
            dice[i] = rd.nextInt(6) + 1;
            switch (dice[i]) {
                case 1:
                    countingArray[0]++;
                    break;
                case 2:
                    countingArray[1]++;
                    break;
                case 3:
                    countingArray[2]++;
                    break;
                case 4:
                    countingArray[4]++;
                    break;
                case 5:
                    countingArray[5]++;
                    break;
                case 6:
                    countingArray[6]++;
                    break;
            }
        }
        maxcheck(countingArray);
    }

    public static void maxcheck(int countingArray[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 6; i++) {
            if (max < countingArray[i])
                max = countingArray[0];
        }
        for (int i = 0; i < 6; i++) {
            if (max == countingArray[i])
                System.out.println("The max appearance of face " + (i + 1) + " : " + max);
        }
    }

    public static void main(String args[]) {
        int times = Integer.parseInt(args[0]);
        rollDie(times);
    }
}