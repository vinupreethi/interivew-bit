package org.example;

import java.util.Scanner;

public class GirlsAndBoys {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        while(true)
        {
            long girls=scanner.nextLong();
            long boys=scanner.nextLong();
            if(girls==-1 || boys== -1)
                break;
            int divident= (int) Math.max(girls,boys);
            int divisor= (int) Math.min(girls,boys);

            int answer= (int) Math.ceil((float)divident/(divisor+1));
            System.out.println(answer);
        }

    }
}
