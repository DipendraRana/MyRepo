/********************************************************************************
 * Purpose: illustrate various trigonometric functions in the Math library, such
 *          as Math.sin(), Math.cos(), and Math.toRadians(). Firstly reads in an
 *          angle (in degrees), converts to radians, and then performs various
 *          trigonometric calculations.
 *
 * @author:  Dipendra Rana
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class Trig {
    public static void main(String args[]){
        double angledeg = Double.parseDouble(args[0]);
        double anglerad = Math.toRadians(angledeg);

        double sin = Math.sin(anglerad);
        System.out.println("sin(" + angledeg + ") = " + sin);

        double cos = Math.cos(anglerad);
        System.out.println("cos(" + angledeg + ") = " + cos);

        double tan = Math.tan(anglerad);
        System.out.println("tan(" + angledeg + ") = " + tan);
    }
}
