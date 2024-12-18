package org.example;

public class RepeatedNumberWorking {

    public static void main(String args[])
    {
        int a[]={3,1,2,5,3};

        int n=a.length;
        int repeated=-1;
        int missing=-1;
        for(int i=0;i<n;i++)
        {
            int element=a[i];
            int chair=a[i]-1;
            if(element==a[chair] && a[i]==element && i+1!=element)
            {
                repeated=element;
            }
            else if(element!=a[chair])
            {
                int temp=a[i];
                a[i]=a[chair];
                a[chair]=temp;
                i--;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(i+1!=a[i])
                missing=i+1;
        }
        System.out.println(repeated+" "+missing);
     }
}
