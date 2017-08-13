/********************************************************************************
* Purpose: To find the Binary representation of a decimal number
*
* @author:  Dipendra Rana
* @version: V1.0
* @since:   7-8-2017
*********************************************************************************/

package com.bridgelabz.util;

public class Binary{
	public void convertToBinary(int decimalNo){
		int copyOfDecimalNo=decimalNo;
		int count=0;
		while(copyOfDecimalNo != 0){
			copyOfDecimalNo=copyOfDecimalNo/2;
			count++;
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
	}
	public static void main(String args[]){
		int no = Integer.parseInt(args[0]);
		Binary bin=new Binary();
		bin.convertToBinary(no);
	}
}
