package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class Lexicographer {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            HashMap<Integer,Integer> hashMap=new HashMap<>();
            HashMap<Integer,Integer> hashMap1=new HashMap<>();
            int n=sc.nextInt();
            int answer[]=new int[n];
            int a[]=new int[n];
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
            }
            
            for(int k=0;k<n;k++)
            {
                hashMap1.put(a[k],a[k]);
            }
            System.out.println("hashMap1 = " + hashMap1);
            int count=1;
            int ik=0;
            while(ik<n)
            {
                
                if(hashMap1.get(a[i])==0)
                {
                    answer[ik]=count;
                    int value=count-1;
                    hashMap1.put(count,value);
                    count++;
              
                    
                }
                else if(hashMap1.get(a[i])==0 && hashMap.get(a[i])==0)
                {
                    answer[ik]=count;
                    hashMap.put(a[ik],count);
                    int value=count-1;
                    hashMap1.put(a[ik],value);
                    count++;
                    
                }
                else if(hashMap.get(a[ik])!=null)
                {
                    int counter=hashMap.get(a[ik]);
                    answer[ik]=counter;
      
                    hashMap1.put(a[ik],counter);
                }
                ik++;
                
                
            }

            for(int j=0;j<n;j++)
            {
                System.out.println("answer[j] = " + answer[j]);
            }







        }
        
        
        
    }
}
