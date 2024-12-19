package org.example;

public class MaxChunks {
    public static void main(String args[])
    {
        int arr[]={4,3,2,1,0};
        int minim=Integer.MAX_VALUE;
        int min_index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(minim>=arr[i]) {
                minim = arr[i];
                min_index=i;
            }
        }
        System.out.println(min_index);
        System.out.println(minim);
    }
}
