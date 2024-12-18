package org.example;

import java.util.*;

public class AllFactors {
    public static void main(String args[])
    {
        int a=6;
        ArrayList<Integer> factors = new ArrayList<>();
        int k=a;
        for(int i=1;i<Math.sqrt(a);i++)
        {
            if(a%i==0)
            {
                factors.add(i);
                factors.add(a/i);
            }
        }
        Collections.sort(factors);

       
    }
}
