/********************************************************************************
 * Purpose: takes two integer command-line arguments x and y and prints the
 *          Euclidean distance from the point (x, y) to the origin (0, 0).
 *
 * @author:  Dipendra Rana
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

import java.util.Scanner;

public class Distance {

    public static void computDist(int xCoordinate, int yCoordinate) {
        double distance = Math.sqrt(Math.pow(xCoordinate, 2) + Math.pow(yCoordinate, 2));
        System.out.println("The Euclidean distance from the point (" + xCoordinate + "," +
                yCoordinate + ") to the origin (0,0) is " + distance);
    }

    public static void main(String args[]) {
        int xCoordinate, yCoordinate;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x coordinate:");
        xCoordinate = sc.nextInt();
        System.out.print("Enter the value of y coordinate");
        yCoordinate = sc.nextInt();
        computDist(xCoordinate, yCoordinate);
    }
}