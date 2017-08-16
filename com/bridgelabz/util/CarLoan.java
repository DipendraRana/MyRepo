/********************************************************************************
* Purpose: To find the monthly payment we would have to make over Y years
*          to pay off a P principal loan amount at R per cent interest 
*          compounded monthly
*
* @author:  Dipendra Rana
* @version: V1.0
* @since:   7-8-2017
*********************************************************************************/

package com.bridgelabz.util;

public class CarLoan {

    public static void emi(int principal, double rate, int year) {
        int n = 12 * year;
        double r = rate / (12 * 100);

        double payment = (principal * r) / (1 - Math.pow(1 + r, -n));
        System.out.println(payment);
    }

    public static void main(String args[]) {
        int principal = Integer.parseInt(args[0]);
        double rate = Double.parseDouble(args[1]);
        int year = Integer.parseInt(args[2]);

        emi(principal, rate, year);
    }
}
