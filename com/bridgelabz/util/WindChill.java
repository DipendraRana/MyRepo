/********************************************************************************
 * Purpose: that takes two double command-line arguments t and v and prints the
 *          wind chill.
 *
 * @author:  Dipendra Rana
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class WindChill {
    public static void main(String args[]){
        double windChill;   //effective temperature

        double temperature = Double.parseDouble(args[0]);     //in fahrenheit
        double speed = Double.parseDouble(args[1]);   //in miles per hour

        if((temperature <= Math.abs(50)) && (speed > 120 || speed < 3)){
            windChill=(35.74 + (0.6215 * temperature) + (((0.4275 * temperature) - 35.75) * Math.pow(speed,0.16)));
            System.out.println("The wind chill is " + windChill);
        }
        else
            System.out.println("You violated the condition");
    }
}
