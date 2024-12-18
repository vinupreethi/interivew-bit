package org.example;

public class NextPermutation {
    public static void main(String args[])

    {
        int a[]={3,2 ,1, 5, 4};
        int index1=-1;
        int index2=-1;
        int len=a.length;

        for(int i=len-2;i>=0;i--)
        {
            if(a[i]<a[i+1])
            {
                index1=i;
                break;
            }
        }

        for(int i=len-1;i>=0;i--)
        {
            if(a[i]>a[index1])
            {
                index2=i;
                break;
            }
        }
        System.out.println("index1 = " + index1);
        System.out.println("index2 = " + index2);
        int temp=a[index1];
        a[index1]=a[index2];
        a[index2]=temp;

        int start=index1+1;
        int end=a.length-1;

        while(start<=end)
        {
            temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }

        for(Integer i:a)
            System.out.print(i+" ");

        System.out.println("end = " + end);


    }
}
