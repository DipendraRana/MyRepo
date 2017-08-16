/********************************************************************************
 * Purpose: find the 2nd largest and the 2nd smallest element from an unsorted
 *          array and without sorting the array.
 *
 * @author:  Dipendra Rana
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class SecondLargestSmallest {

    public static void searching2ndMaxMin(int array[]) {
        int max1 = array[0], min1 = array[0];   //max and min
        int max2 = Integer.MIN_VALUE, min2 = Integer.MAX_VALUE;    //2nd max and min

        for (int i = 1; i < array.length; i++) {
            if (max1 < array[i]) {  //obtaining max and 2nd max element
                max2 = max1;
                max1 = array[i];
            } else if (max2 < array[i] && array[i] != max1)  //finding 2nd max element if present
                max2 = array[i];                      //beyond max element

            if (min1 > array[i]) {  //obtaining min and 2nd min element
                min2 = min1;
                min1 = array[i];
            } else if (min2 > array[i] && array[i] != min1)  //finding 2nd min element if present
                min2 = array[i];                      //beyond min element
        }
        if (max2 == Integer.MIN_VALUE && min2 == Integer.MAX_VALUE)
            System.out.println("No 2nd max or min element is present");
        else {
            System.out.println("2nd Max element = " + max2);
            System.out.println("2nd Min element = " + min2);
        }
    }

    public  static void main(String args[]){
        int array[] = {4,4,4,4,4,4,4,4};
        searching2ndMaxMin(array);

    }
}