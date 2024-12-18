package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindLongestSpecial {

    public static void main(String args[]) {
        String s = "aaaa";
        Map<String, Integer> substringHashmap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                substringHashmap.put(s.substring(i, j + 1), substringHashmap.getOrDefault(s.substring(i, j + 1), 0) + 1);
            }
        }
        int ans=0;
        for (Map.Entry<String, Integer> entries : substringHashmap.entrySet()) {
            if (entries.getValue() >= 3) {
                String stringfromsubstring = entries.getKey();
                char start = stringfromsubstring.charAt(0);
                int first = 0;
                //System.out.println(stringfromsubstring);
                while (first < stringfromsubstring.length() && start == stringfromsubstring.charAt(first)) {
                    first++;
                }
                if(first==stringfromsubstring.length())
                {
                    ans=Math.max(ans,stringfromsubstring.length());
                }

            }
        }
        System.out.println(ans);


    }
}
