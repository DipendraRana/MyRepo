/********************************************************************************
 * Purpose: Smulate a gambler where he starts with certain stake in INR and
 *          places fair Re 1 bet until he/she goes broke or reaches the goal set
 *          as input. Keeps track of the number of times won and number of
 *          bets made. Run the simulation N times.
 *
 * @author:  Dipendra Rana
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class GamblingSimulator {
    public static void main(String args[]){
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int trials = Integer.parseInt(args[2]);
        int bet = 0;
        int win = 0;

        for(int i = 0;i < trials;i++){
            int cash = stake;
            while (cash > 0 && cash < goal){
                bet++;
                if(Math.random() > 0.5)
                    cash++;
                else
                    cash--;
            }
            if(cash == goal)
                win++;
        }
        System.out.println("No. of time won is: " + win);
        System.out.println("Percentage win is: " + 100 * win / trials +"%");
        System.out.println("Average no. of bets made is: "+ bet / trials);
    }
}