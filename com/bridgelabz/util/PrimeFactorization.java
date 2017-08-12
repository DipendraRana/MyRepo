/********************************************************************************
 * Purpose: compute Factors of a number N using prime factorization method
 *
 * @author:  Dipendra Rana
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class PrimeFactorization {
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        int count;

        if(n == 0|| n== 1)
            System.out.println("This numbers cannot have prime factorization");
        else {
            int quotient = n;
            for (int i = 2; i <= n && quotient != 1; i++) {  //finding prime no. from 2 to <=n
                count = 0;                                   //quotient!=1 is when the entred no. is reduced to 1
                for (int j = 2; j < i / 2; j++) {       //checking for the prime no.
                    if (i % j == 0) {
                        count++;        //counts the no. of times a no. is evenly divisible
                    }
                }
                if (count == 0 && n != 1 && n != 0) {      //when prime no. is found
                    while (quotient % i == 0) {     //dividing till quotient is evenly divisible
                        System.out.print(i + " ");
                        quotient = quotient / i;
                    }
                }
            }
        }
    }
}
