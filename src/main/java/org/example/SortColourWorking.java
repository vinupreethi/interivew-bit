package org.example;

public class SortColourWorking {

    public static void main(String args[])
    {
        int a[]={1,2,0};
        int n=a.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high)
        {
            if(a[mid]==2)
            {
                int temp=a[mid];
                a[mid]=a[high];
                a[high]=temp;
                high--;
                mid++;
            }
            else if(a[mid]==1)
                mid++;
            else if(a[mid]==0)
            {
                int temp=a[mid];
                a[mid]=a[low];
                a[low]=temp;
                low++;
                mid++;
            }
        }
        for(int i:a)
            System.out.println("i = " + i);
    }
}
