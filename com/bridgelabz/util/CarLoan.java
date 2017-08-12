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
    public static void main(String args[]){
        int principal = Integer.parseInt(args[0]);
        double ratePerYear = Double.parseDouble(args[1]);
        int year = Integer.parseInt(args[2]);

        int month = 12 * year;		//year converted to month
        double ratePerMonth = ratePerYear / (12 * 100);		//rate per annum converted to per month

        double payment = (principal * ratePerMonth) / (1 - Math.pow(1 + ratePerMonth,-month));

        System.out.println(payment);
    }
}
