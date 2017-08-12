/********************************************************************************
 * Purpose: takes initials as input and prints the initials using nine rows
 *          of asterisks
 *
 * @author:  Dipendra Rana
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class PrintInitials {
    public static void main(String args[]){
        String str = args[0];

        Characters an=new Characters();

        if(str.contains("a"))
            an.a();
        if(str.contains("b"))
            an.b();
        if(str.contains("c"))
            an.c();
    }
}
