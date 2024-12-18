package org.example;

import java.util.HashMap;

public class StringAndItsFrequence {
    public static void main(String args[])
    {
        String str="abbhuabcfghh";
        HashMap<Character,Integer> hashMap=new HashMap<>();
        String sbr="";
        for(int i=0;i<str.length();i++)
        {
            if(!hashMap.containsKey(str.charAt(i)))
            {
                sbr+=str.charAt(i);
            }
            hashMap.put(str.charAt(i),hashMap.getOrDefault(str.charAt(i),0)+1);

        }
        String ans="";
       for(int i=0;i<sbr.length();i++)
       {
           ans+=sbr.charAt(i);
           ans+=hashMap.get(sbr.charAt(i));
       }
        System.out.println(ans);



    }
}
