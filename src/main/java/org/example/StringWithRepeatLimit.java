package org.example;

import java.util.*;

public class StringWithRepeatLimit {
    public static void main(String args[]) {
        String str = "cczazcc";
        int repeatLimit=3;
        String result = "";
        TreeMap<Character, Integer> hashMap = new TreeMap<>();
        for (int j = 0; j < str.length(); j++) {
            hashMap.put(str.charAt(j), hashMap.getOrDefault(str.charAt(j), 0) + 1);
        }
        for(Map.Entry<Character,Integer> mp: hashMap.entrySet())
        {
            if(mp.getValue()<=repeatLimit)
            {
                result+=mp.getValue();
                hashMap.remove(mp.getKey());
            }
            else
            {
                int answer=mp.getValue();

            }
        }

    }
}
