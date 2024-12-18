package org.example;

import java.util.Scanner;

public class JustNext {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t!=0)
        {
            int n=scanner.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<arr.length;i++)
                arr[i]=scanner.nextInt();
            int index1=-1;
            int index2=-1;
            for(int i=arr.length-2;i>=0;i--)
            {
                if(arr[i]<arr[i+1])
                {
                    index1=i;
                    break;
                }
            }
            if (index1 == -1) {
                // Print the array in ascending order
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i]);
                }
                System.out.println();
                return;
            }
            for(int j=arr.length-1;j>=0;j--)
            {
                if(arr[j]>arr[index1])
                {
                    index2=j;
                    break;
                }

            }
//            System.out.println(index1);
//            System.out.println(index2);
            int temp=arr[index1];
            arr[index1]=arr[index2];
            arr[index2]=temp;

            int k=index1+1;
            n=n-1;
           while(k<n)
            {
                int temporary=arr[k];
                arr[k]=arr[n];
                arr[n]=temporary;
                k++;
                n--;
            }
            StringBuilder answer = new StringBuilder();
            for (int ans = 0; ans < arr.length; ans++) {
                answer.append(arr[ans]);
            }
            System.out.println(answer.toString());
            t--;
        }
    }
}
