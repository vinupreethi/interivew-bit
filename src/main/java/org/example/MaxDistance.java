package org.example;

import java.util.*;
import java.util.stream.Collectors;
class Pair1
{
    int first;
    int second;
}
public class MaxDistance {
    public static void main(String args[])
    {
        int a[]={ -1, -1, 2};
        int result[]=new int[a.length];
        List<Pair1> lst=new ArrayList<>();
        for(int i=0;i<a.length;i++) {
            Pair1 pair1=new Pair1();
            pair1.first=a[i];
            pair1.second=i;
            lst.add(pair1);
        }
        Collections.sort(lst, new Comparator<Pair1>() {
            @Override
            public int compare(Pair1 o1, Pair1 o2) {
                return o1.first-o2.first;
            }
        });
        int k=0;
        for(Pair1 i: lst) {
            result[k] = i.second;k++;
        }
        for(int ik=result.length-2;ik>=0;ik--)
            result[ik]=Math.max(result[ik],result[ik+1]);
        int diff=0;
        int j=0;
       for(Pair1 i:lst)
       {
           System.out.println("result[j] = " + result[j]);
           System.out.println("i.second = " + i.second);
           diff=Math.max(result[j]-i.second,diff);
           j++;
       }
        System.out.println("diff = " + diff);
       
      

    }
}
