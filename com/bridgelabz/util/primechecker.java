/**********************************************
* Purpose: To Display the hello World on Screen
*
* @author:  Dipendra Rana
* @version: V1.0
* @since:   6-8-2017
**********************************************/

package com.bridgelabz.util;		//package defination

import java.util.Scanner;		//importing Scanner class which is present in java package and inside it the util package
 
public class primechecker
{
  public static void main(String args[]){
    int count = 0;
    int no;
    int i;
    Scanner sc = new Scanner(System.in);			//object of Scanner class is formed
    System.out.print("Enter the number:");
    no=sc.nextInt();						//taking input from user using nextInt() method
    if(no==0||no==1)						//it implies that number 0 and 1 is not prime 
      System.out.println("Entered number is not prime");
    else{
      for(i=2;i<(no/2);i++){                                    //checking if 
      	 if(no%i==0)
		count++;
      }

     if(count>0)
     	System.out.println("Entered number is not prime");
     else
     	System.out.println("Entered number is prime");
    }
  }
}
