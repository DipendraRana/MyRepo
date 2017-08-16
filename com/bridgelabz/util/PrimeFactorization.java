/********************************************************************************
 * Purpose: compute Factors of a number N using prime factorization method
 *
 * @author:  Dipendra Rana
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class PrimeFactorization {

    public static void primeFactor(int number) {
        int count;

        if (number == 0 || number == 1)
            System.out.println("This number cannot have prime factorization");
        else {
            int d = number;
            for (int i = 2; i <= number && d != 1; i++) {   //taking no.s one by one which is < number
                count = 0;
                for (int j = 2; j < i / 2; j++) {   //checking each no. for prime
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 0 && number != 1 && number != 0) { //each prime divides the number till
                    while (d % i == 0) {                        //it evenly divide the number
                        System.out.print(i + " ");
                        d = d / i;
                    }
                }
            }
        }
    }

    public static void main(String args[]) {
        int number = Integer.parseInt(args[0]);
        primeFactor(number);
    }
}