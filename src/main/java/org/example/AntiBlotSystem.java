package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class AntiBlotSystem {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t != 0) {
            String answer = "";
            Scanner sc = new Scanner(System.in);

            answer += sc.nextLine();
            String equation[] = answer.split("\\=", 2);
            String rightside = equation[1].trim();
            String add[] = equation[0].split("\\+", 2);
            String left1 = add[0].trim();
            String left2 = add[1].trim();

            if (left1.contains("machula")) {
                BigInteger left_int1 = new BigInteger(left2);
                BigInteger right_side = new BigInteger(rightside);
                BigInteger answer1 = right_side.subtract(left_int1);
                System.out.println(left_int1+" "+"+"+" "+answer1+" = "+right_side);

            } else if (left2.contains("machula")) {
                BigInteger left_int2 = new BigInteger(left1);
                BigInteger right_side = new BigInteger(rightside);
                BigInteger answer2 = right_side.subtract(left_int2);
                System.out.println(answer2+" "+"+"+" "+left_int2+" = "+right_side);

            } else {
                BigInteger left_int1 = new BigInteger(left1);
                BigInteger left_int2 = new BigInteger(left2);
                BigInteger answer3 = left_int1.add(left_int2);
                System.out.println(left_int1+" "+"+"+" "+left_int1+" = "+answer3);
            }
            t--;
        }

    }
}




