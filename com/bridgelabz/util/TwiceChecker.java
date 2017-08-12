/********************************************************************************
 * Purpose: Given an array with 100 integers containing 1 to 100 and among them
 *          one number is repeated twice. Write the Logic to find out the repeated
 *          number.
 *
 * @author:  Dipendra Rana
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class TwiceChecker {
    public static void main(String args[]){
        int[] array = {1,2,3,4,10,2,7,11,12,14};
        int found = 0;

        for(int i = 0;i < 10;i++){
            for(int j = i + 1;j < 10;j++){
                if(array[i] == array[j]){
                    System.out.println(array[i]);
                    found++;
                }
                if(found == 1)
                    break;
            }
            if(found == 1)
                break;
        }
    }
}
