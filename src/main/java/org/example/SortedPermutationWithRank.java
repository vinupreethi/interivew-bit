package org.example;


import java.util.*;


public class SortedPermutationWithRank {
    public static void main(String args[]) {
        String ans = "bbbbaaaa";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < ans.length(); i++) {
            if (hashMap.get(ans.charAt(i)) != null) {
                int value = hashMap.get(ans.charAt(i));
                value++;
                hashMap.put(ans.charAt(i), value);
            } else
                hashMap.put(ans.charAt(i), 1);
        }
        System.out.println(hashMap);
        int ik=ans.length();
        for (int i = 0; i < ans.length(); i++) {
            int cnt = 0;
            Set<Character> lst = new HashSet<>();
            for (int j = i + 1; j < ans.length(); j++) {
                lst.add(ans.charAt(j));
                if (ans.charAt(i) > ans.charAt(j)) {
                    cnt++;

                }
            }
            int fac = factorial(ik-1) * cnt;
            ik--;
            //System.out.println(fac);
            int res = 1;
            for (Character st : lst)
                res = res * factorial(hashMap.get(st));
            System.out.println(fac / res);

        }


    }


    private static int factorial(int ans) {
        int answ = 1;
        if (ans == 0 || ans == 1)
            return 1;
        for (int i = 2; i <= ans; i++) {
            answ = answ * i;
        }
        return answ;

    }
}

