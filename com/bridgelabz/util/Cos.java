/********************************************************************************
 * Purpose:  Compute cos x using the Taylor series expansions
 *
 * @author:  Dipendra Rana
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class Cos {
    //Recursive function to find factorial
    public static int factorial(int angelX){
        if(angelX == 1)
            return 1;
        else
            return angelX = angelX*factorial(angelX - 1);
    }
    public static void main(String args[]){
        double angelX = Integer.parseInt(args[0]);
        int copyOfAngelX = (int) angelX;
        angelX = angelX % (2 * Math.PI);      // Convert angle x to an angle between -2 PI and 2 PI
        //Taylor series expansion for cos x
        double cosvalue = 1 - Math.pow(angelX,2) / factorial(2) + Math.pow(angelX,4) / factorial(4)
                          - Math.pow(angelX,6) / factorial(6);
        System.out.println("Cos " + copyOfAngelX + " = " + cosvalue);
    }
}
