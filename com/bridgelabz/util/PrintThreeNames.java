/********************************************************************************
 * Purpose: that takes three names as input and prints out a proper sentence
 *          with the names in the reverse of the order given
 *
 * @author:  Dipendra Rana
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class PrintThreeNames {
    public static void main(String args[]){
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];

        System.out.println("Hi " + name3 + " , " + name2 + " , " + name1);
    }
}
