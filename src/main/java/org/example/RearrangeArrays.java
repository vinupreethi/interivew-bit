package org.example;

import java.util.ArrayList;

public class RearrangeArrays {
    
    public static void main(String args[])
    {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(3);
        a.add(0);
        a.add(1);
        a.add(4);
        a.add(2);
        int n=a.size();
        for(int i=0;i<n;i++)
        {

            a.set(a.get(i), a.get(i)+((a.get(a.get(i))%n) * n));

        }
        for(int i=0;i<n;i++)
        {
            a.set(a.get(i),a.get(i)/n);
        }
        System.out.println("a = " + a);
    }
}
