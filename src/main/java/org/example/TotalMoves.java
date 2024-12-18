package org.example;

import java.util.HashMap;

public class TotalMoves {
    public static void main(String args[])
    {
        int A=4;
        int B=4;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        hashMap.put(1,7);
        hashMap.put(2,9);
        hashMap.put(3,11);
        hashMap.put(4,13);
        hashMap.put(8,7);
        hashMap.put(7,9);
        hashMap.put(6,11);
        hashMap.put(5,13);

        Math.min(hashMap.get(A),hashMap.get(B));
    }
}
