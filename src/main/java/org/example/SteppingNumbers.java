package org.example;

import java.util.ArrayList;
import java.util.List;

public class SteppingNumbers {
    public static void main(String args[])
    {
        int a=10;
        int b=20;
        List<Integer> result=new ArrayList<>();
        for(int i=a;i<=b;i++)
        {
            if(isAdjacent(i))
            {
                result.add(i);
            }
        }
        System.out.println(result);
    }

    private static boolean isAdjacent(int number) {
        String ans= String.valueOf(number);
        for(int i=1;i<ans.length();i++)
        {
            if(Math.abs(Integer.valueOf(ans.charAt(i))-Integer.valueOf(ans.charAt(i-1)))!=1)
            {
                return false;
            }

        }
        return true;
    }
}
