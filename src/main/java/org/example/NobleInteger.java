package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class NobleInteger {
    public static void main(String args[])
    {
        int a[]={3,2,1,3};
        int n=a.length;
        Arrays.sort(a);
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        System.out.println("hashMap.get(0) = " + hashMap.get(0));

    }
}
