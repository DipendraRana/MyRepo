/********************************************************************************
 * Purpose: taking a, b and c as input values and print the following integer
 *          operations a + b *c, a * b + c, c + a / b, and a % b + c.
 *
 * @author:  Dipendra Rana
 * @version: V1.0
 * @since:   7-8-2017
 *********************************************************************************/

package com.bridgelabz.util;

public class IntOpt {

    public static void operation(int a, int b, int c) {
        int ans;

        ans = a + b * c;
        System.out.println(a + "+" + b + "*" + c + " = " + ans);

        ans = a * b + c;
        System.out.println(a + "*" + b + "+" + c + " = " + ans);

        ans = c + a / b;
        System.out.println(c + "+" + a + "/" + b + " = " + ans);

        ans = a % b + c;
        System.out.println(a + "%" + b + "+" + c + " = " + ans);
    }

    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        operation(a, b, c);
    }
}