/********************************************************************************
* Purpose: To find the Binary representation of a decimal number
*
* @author:  Dipendra Rana
* @version: V1.0
* @since:   7-8-2017
*********************************************************************************/

package com.bridgelabz.util;

public class Binary{
	
	public int[] convertToBinary(int decimalNo){

		int copyOfDecimalNo=decimalNo;
		int count=0;
		while(copyOfDecimalNo != 0){
			copyOfDecimalNo=copyOfDecimalNo/2;
			count++;
		}
		if(32-count!=0){		//checking if binary no is of 4 byte or not
			int padding=32-count;
			while(padding!=0){      //if not of 4 byte then padd with 0's to make it 
				System.out.print(0);	//4 byte
				padding--;
			}
		}
		int storeBin[]=new int[count];
		while(decimalNo!=0&&count>=0){
			count--;
			storeBin[count]=decimalNo%2;
			decimalNo=decimalNo/2;
		}
		while(count<storeBin.length){
			System.out.print(storeBin[count]);
			count++;
		}
		System.out.println();
		return storeBin;
	}

	public static void main(String args[]){

		int no = Integer.parseInt(args[0]);
		Binary bin=new Binary();
		bin.convertToBinary(no);
	}
}
