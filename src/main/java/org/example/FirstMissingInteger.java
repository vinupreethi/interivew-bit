package org.example;

public class FirstMissingInteger {
    public static void main(String args[])
    {
        int a[]={3,1,2,3,5};
        int n=a.length;
        int result[]=new int[2];
        for(int i=0;i<n;i++)
        {
            int element=a[i]; //3
            int chair=a[i]-1; //3

            if(a[chair]!=element )  //0!=3
            {
                int temp=a[i];
                a[i]=a[chair];
                a[chair]=temp;
                i--;
            }
            else if(element==a[chair] && i+1!=element)
            {
                result[0]=a[chair];
            }
        }
        for(int i=0;i<n;i++)
        {
            if(i!=a[i]-1)
            {
                result[1]=i+1;
            }
        }
        if(result[1]==0)
            result[1]=n+1;
        System.out.println("result[0] = " + result[0]);
        System.out.println("result[1] = " + result[1]);
        
    }
}
