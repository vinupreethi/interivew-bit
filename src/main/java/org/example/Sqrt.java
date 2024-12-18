package org.example;

import java.util.Scanner;

public class Sqrt {
    public static void main(String args[])
    {
        int a= 15;
        int low=0;
        int high=a;
        int result=a;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(mid * mid <= a)
            {
                result=mid;
                low=mid+1;
            }
            else if(mid * mid >a)
            {
                high=mid-1;
            }
        }
        System.out.println(result);
    }
}
