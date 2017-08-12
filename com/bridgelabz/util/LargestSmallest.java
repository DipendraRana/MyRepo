/********************************************************************************
 * Purpose: find the 2nd largest and the 2nd smallest element from an unsorted
 *          array and without sorting the array.
 *
 * @author:  Dipendra Rana
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class LargestSmallest {
    public  static void main(String args[]){
        int array[] = {1,4,3,12,4,8,16,0,6};
        int max1 = array[0],min1 = array[0];    //max and min element
        int max2 = 0,min2 = 0;      //2nd max and min element

        for(int i = 1;i < array.length;i++){
            if(max1 <= array[i]){       //checking validity of max element
                max2 = max1;            //storing previous max value
                max1 = array[i];        //storing maximum value
            }
            if(min1 >= array[i]){       //checking validity of min element
                min2 = min1;            //storing previous min value
                min1 = array[i];        //storing manimum value
            }
        }
        System.out.println("2nd Max element = " + max2);
        System.out.println("2nd Min element = " + min2);
    }
}