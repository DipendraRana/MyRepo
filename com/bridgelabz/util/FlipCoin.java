/********************************************************************************
 * Purpose:  To simulate a coin flip and print out "Heads" or "Tails" accordingly
 *           and finally print the percentage of Head vs Tail.
 *
 * @author:  Dipendra Rana
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class FlipCoin {
<<<<<<< HEAD
    public static void testing(int noOfTimes) {
        double coin;
        int countHead = 0, countTail = 0;
        for (int i = 0; i < noOfTimes; i++) {
            coin = Math.random();
            if (coin >= 0.5) {
                countHead++;
                System.out.println("Head");
            } else {
                countTail++;
                System.out.println("Tail");
            }
        }
        System.out.println("The percentage of Head occurence is " + 100 * countHead / noOfTimes + "%");
        System.out.println("The percentage of Tail occurence is " + 100 * countTail / noOfTimes + "%");
    }

    public static void main(String args[]) {
        int times = Integer.parseInt(args[0]);
        testing(times);
=======
    public static void main(String args[]){
	int times = Integer.parseInt(args[0]);
	double coin;
	int countHead=0,countTail=0;
	for(int i=0;i<times;i++){
        	coin = Math.random();
        	if(coin >= 0.5){
			countHead++;
            		System.out.println("Head");
		}
        	else{
			countTail++;
            		System.out.println("Tail");
		}
	}
	System.out.println("The percentage of Head occurence is "+100*countHead/times+"%");
	System.out.println("The percentage of Tail occurence is "+100*countTail/times+"%");	    
>>>>>>> origin
    }
}