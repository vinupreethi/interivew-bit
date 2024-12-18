package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class AntiBlot {
    public static void main(String args[]) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            String answer = "";
            String left1 = sc.next();
            String add = sc.next();
            String left2 = sc.next();
            String equal = sc.next();
            String right = sc.next();

            if (left1.contains("machula")) {
                Long left2_str = Long.parseLong(left2);
                Long right2_str = Long.parseLong(right);
                Long answer1 = right2_str - left2_str;
                System.out.println(answer1+ " " + "+" + " " + left2 + " = " + right2_str);

            } else if (left2.contains("machula")) {
                Long left1_str= Long.parseLong(left1);
                Long right_side = Long.parseLong(right);
                Long answer2 = right_side - left1_str;
                System.out.println(left1_str + " " + "+" + " " + answer2 + " = " + right_side);

            } else {
                Long left_int1 = Long.parseLong(left1);
                Long left_int2 = Long.parseLong(left2);
                Long answer3 = left_int1 + left_int2;
                System.out.println(left_int1 + " " + "+" + " " + left_int2 + " = " + answer3);
            }
            t--;
        }

    }
}
