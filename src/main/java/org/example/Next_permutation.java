package org.example;

public class Next_permutation {
    public static void main(String args[])
    {
        String A="218765";
        int len=A.length();
        int a[]=new int[len];
        for(int i=0;i<len;i++)
            a[i]=Integer.parseInt(String.valueOf(A.charAt(i)));
        int n=a.length;
        int index1=-1;
        int index2=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]<a[i+1])
            {
                index1=i;
                break;
            }
        }
        if(index1==-1)
        {
            index1=0;
            index2=n-1;
        }
        else
        {
            for(int i=n-1;i>=0;i--)
            {
                if(a[i]>a[index1])
                {
                    index2=i;
                    break;
                }
            }

            int temp=a[index1];
            a[index1]=a[index2];
            a[index2]=temp;
            index1=index1+1;
            index2=n-1;
        }
        while(index1<=index2)
        {
            int temp=a[index1];
            a[index1]=a[index2];
            a[index2]=temp;
            index1++;
            index2--;
        }
        String answer="";
        for(int i=0;i<n;i++)
           answer+=a[i];
        System.out.println("answer = " + answer);
    }
}
