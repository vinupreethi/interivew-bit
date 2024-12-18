package org.example;

public class SortArrayWithSquares {
    public static void main(String args[])
    {
        int a[]={-6, -3, -1, 2, 4, 5};

        int low=0;
        int high=a.length-1;
        int answer[]=new int[a.length];
        int i=0;
        while(low<=high )
        {
            if(Math.abs(a[low])>=Math.abs(a[high]))
            {
                answer[i]=a[low]*a[low];
                low++;
            }
            else
            {
                answer[i]=a[high]*a[high];
                high--;
            }
            i++;
        }
        for(Integer ia:answer)
            System.out.println("i = " + ia);
    }
}
