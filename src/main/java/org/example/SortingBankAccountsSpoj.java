package org.example;

import java.util.*;

public class SortingBankAccountsSpoj {
    public static void main(String args[]) throws java.lang.Exception
    {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();

        while(t!=0)
        {
            int n=scanner.nextInt();
            String[] str=new String[n+1];
            int j=0;
            while(true) {
                str[j] = scanner.nextLine();
                if(j==n)
                    break;
                j++;
            }

            TreeMap<String,Integer> hashMap=new TreeMap<>();
            for(int i=1;i<str.length;i++)
                hashMap.put(str[i],hashMap.getOrDefault(str[i],0)+1);


            for(Map.Entry<String,Integer> mp: hashMap.entrySet())
                System.out.println(mp.getKey()+" "+mp.getValue());
            System.out.println();

            t--;

        }
    }
}
