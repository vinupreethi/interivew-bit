package org.example;

import java.util.Scanner;

public class GirlsAndBoysSpoj {
    public static void main(String args[]) throws java.lang.Exception{
        Scanner scanner = new Scanner(System.in);
        while (true) {
            long girls = scanner.nextLong();
            long boys = scanner.nextLong();
            if(girls==-1 && boys == -1)
                break;
            if (girls == boys)
                System.out.println(1);
            else if (girls == 0)
                System.out.println(boys);
            else if (boys == 0)
                System.out.println(girls);
            else if((girls + 1 ==boys) || (boys+1 ==girls))
                System.out.println(1);
            else if (girls > boys)
                System.out.println(girls - boys - 1);
            else if (boys > girls)
                System.out.println(boys - girls - 1);

        }
    }
}
