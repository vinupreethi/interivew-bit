package org.example;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyArray {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            for (int j = 0; j < n; j++) {
                int a[]=new int[n];
                int answer[]=new int[n];
                for(int val=0;val< a.length;val++)
                    a[val]=scanner.nextInt();
                int count=1;

                HashMap<Integer, Integer> hashMap = new HashMap<>();
                HashMap<Integer, Integer> hashMap1 = new HashMap<>();
                for(int ij=0;ij<n;ij++)
                {
                    if(hashMap.get(a[ij])!=null)
                    {
                        int value=hashMap.get(a[ij]);
                        value++;
                        hashMap.put(a[ij],value);
                    }
                    else
                        hashMap.put(a[ij],1);
                }

                for(int k=0;k<n;k++)
                {
                    if(hashMap1.get(a[k])==null)
                    {
                        hashMap1.put(a[k],count);
                        answer[k] = count;
                        count++;
                        int value=hashMap.get(a[k]);
                        value--;
                        hashMap.put(a[k],value);

                    }
                    else if((a[k]%hashMap.get(a[k]))==0)
                    {

                        int value=hashMap.get(a[k]);
                        value=value/a[k];
                        hashMap.put(a[k],value);

                        answer[k]=count;
                        count++;

                    }
                    else if(hashMap1.get(a[k])!=null)
                    {
                        int counter=hashMap1.get(a[k]);
                        answer[k]=counter;
                    }

                }

                for(int ik=0;ik<n;ik++)
                {
                    System.out.println(answer[ik]);
                }


            }
        }
    }
}
