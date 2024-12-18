package org.example;

import java.util.Scanner;

public class GameWithDoors {

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++)
        {
            int alice[]=new int[2];
            int bob[]=new int[2];

            alice[0]=in.nextInt();
            alice[1]=in.nextInt();

            bob[0]=in.nextInt();
            bob[1]=in.nextInt();


            if(alice[1]+1==bob[0])
                System.out.println(1);

            else if(alice[0]==bob[0] && alice[1]==bob[1])
            {
                System.out.println(Math.abs(bob[0]-bob[1]));
            }
            else if(alice[0]==bob[0])
            {
                System.out.println(Math.abs(alice[1]-bob[1])+1);
            }
            else if(alice[1]==bob[1])
            {
                System.out.println(Math.abs(alice[0]-bob[0])-1);
            }
            else
            {
                System.out.println(Math.max(Math.abs(alice[1]-bob[1]),Math.abs(alice[0]-bob[0])));
            }

        }
    }
}
