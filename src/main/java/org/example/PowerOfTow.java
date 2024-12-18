package org.example;

public class PowerOfTow {
    public static void main(String args[])
    {
        int n= 75250;

        for(int i = 2; i<=Math.sqrt(n); i++)
        {
                int a=n;
                while(a%i==0)
                {
                    a=a/i;
                }
            
            if(a==1)
                System.out.println("true = " + true);
                
        }
        System.out.println("false");
    }
}
