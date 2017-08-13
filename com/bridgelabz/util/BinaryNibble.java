/********************************************************************************
* Purpose: To extend the binary class and perform additional operation
*
* @author:  Dipendra Rana
* @version: V1.0
* @since:   7-8-2017
*********************************************************************************/

package com.bridgelabz.util;

public class BinaryNibble extends Binary {
	public static void main(String args[]){
		int decimalNo=Integer.parseInt(args[0]);
		Binary bin=new Binary();
		int catchArray[]=bin.convertToBinary(decimalNo);
		
	}
}
