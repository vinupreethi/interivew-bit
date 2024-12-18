package org.example;

import java.util.ArrayList;

public class min_steps {
    public static void main(String args[])
    {
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        a.add(1);
        a.add(3);
        b.add(1);
        b.add(3);
        int answer=coverPoints(a,b);
        System.out.println("answer = " + answer);

    }

    public static int coverPoints(ArrayList<Integer> a1, ArrayList<Integer> b1) {
        int n=a1.size();
        int sum1=0;
        for(int i=0;i<n-1;i++)
        {
            int value1=Math.abs(a1.get(i)-a1.get(i+1));
            int value2=Math.abs(b1.get(i)-b1.get(i+1));
            sum1+=Math.max(value1,value2);
        }
        return sum1;
    }
}


