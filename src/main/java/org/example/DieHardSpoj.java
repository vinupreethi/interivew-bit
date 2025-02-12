package org.example;

import java.util.Scanner;

public class DieHardSpoj {
    public static void main(String args[]) throws java.lang.Exception
    {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t>0)
        {
            int health=scanner.nextInt();
            int armor=scanner.nextInt();
            //air +3 +2
            //heath -5 -10
            //fire -20 +5
            boolean toggle=true;
            int cnt=0;
            while(health>0 && armor>0)
            {


                if(toggle==true)
                {
                    health+=3;
                    armor+=2;
                    toggle=false;
                }
                else if(toggle==false)
                {
//                    int health1=health-5;
//                    int armor1=armor-10;
//
//                    int health2=health-20;
//                    int armor2=armor+5;
                    if(health-5>0 && armor-10>0)
                    {
                        health=health-5;
                        armor=armor-10;
                    }
                   else if(health-20>0 && armor+5>0)
                    {
                        health=health-20;
                        armor=armor+5;
                    }
                   else
                       break;
                   toggle=true;

                }

                cnt++;
            }
            System.out.println(cnt);

           t--;
        }
    }
}
