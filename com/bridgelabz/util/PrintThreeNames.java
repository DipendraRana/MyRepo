/********************************************************************************
 * Purpose: that takes three names as input and prints out a proper sentence
 *          with the names in the reverse of the order given
 *
 * @author: Dipendra Rana
 * @version: V1.0
 * @since: 7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class PrintThreeNames {

    public static void swappingNames(String threename) {

        int lastspaceindex = threename.lastIndexOf(' ');
        int firstspaceindex = threename.indexOf(' ');
        int length = threename.length();

        char[] storenames = new char[length + 4];
        threename.getChars(lastspaceindex + 1, length, storenames, 0);
        threename.getChars(firstspaceindex + 1, lastspaceindex, storenames, length - lastspaceindex);
        storenames[length - firstspaceindex] = 'a';
        storenames[(length - firstspaceindex) + 1] = 'n';
        storenames[(length - firstspaceindex) + 2] = 'd';
        threename.getChars(0, firstspaceindex, storenames, (length - firstspaceindex) + 4);
        System.out.print("Hi ");
        System.out.println(storenames);
    }

    public static void main(String args[]) {

        String threename = args[0];
        swappingNames(threename);
    }
}