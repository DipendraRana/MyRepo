/********************************************************************************
 * Purpose:  generates the result of rolling a fair six-sided die
 *          (an integer between 1 and 6). Repeat the Die Roll n times and suggest
 *          which number between 1 and 6 fall maximum number of times.
 *
 * @author:  Dipendra Rana
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

import java.util.Random;

public class RollDie {
    //chcecking the max occurences of faces
    public static void maxCheck(int count1,int count2,int count3,int count4,int count5,int count6){
        if (count1 >= count2 && count1 >= count3 && count1 >= count4 && count1 >= count5 && count1 >= count6)
            System.out.println("Max no. of appearance of side 1 is " + count1);
        if (count2 >= count1 && count2 >= count3 && count2 >= count4 && count2 >= count5 && count2 >= count6)
            System.out.println("Max no. of appearance of side 2 is " + count2);
        if (count3 >= count1 && count3 >= count2 && count3 >= count4 && count3 >= count5 && count3 >= count6)
            System.out.println("Max no. of appearance of side 3 is " + count3);
        if (count4 >= count1 && count4 >= count2 && count4 >= count3 && count4 >= count5 && count4 >= count6)
            System.out.println("Max no. of appearance of side 4 is " + count4);
        if (count5 >= count1 && count5 >= count2 && count5 >= count3 && count5 >= count4 && count5 >= count6)
            System.out.println("Max no. of appearance of side 5 is " + count5);
        if (count6 >= count1 && count6 >= count2 && count6 >= count3 && count6 >= count4 && count6 >= count5)
            System.out.println("Max no. of appearance of side 6 is " + count6);
    }
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        int dice;
        int count1 = 0,count2 = 0,count3 = 0,count4 = 0,count5 = 0,count6 = 0;

        Random rd = new Random();
        for(int i = 0;i < n;i++){
            dice = rd.nextInt(6) + 1;
            switch (dice){
                case 1: count1++;
                        break;
                case 2: count2++;
                        break;
                case 3: count3++;
                        break;
                case 4: count4++;
                        break;
                case 5: count5++;
                        break;
                case 6: count6++;
                        break;
            }
        }
        maxCheck(count1,count2,count3,count4,count5,count6);
    }
}
