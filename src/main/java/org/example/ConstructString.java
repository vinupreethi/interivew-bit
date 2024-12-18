package org.example;

import java.util.*;

public class ConstructString {
    public static void main(String args[]) {
        String str = "cczazcc";
        int repeat = 3;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        PriorityQueue<Character> priorityQueue = new PriorityQueue<>((a, b) ->
        {
            return b.compareTo(a);
        });
        for (int i = 0; i < str.length(); i++) {
            hashMap.put(str.charAt(i), hashMap.getOrDefault(str.charAt(i), 0) + 1);
            if (!priorityQueue.contains(str.charAt(i)))
                priorityQueue.offer(str.charAt(i));
        }
        System.out.println(priorityQueue);
        String result = "";
        while (!priorityQueue.isEmpty()) {
            char ch = priorityQueue.poll();
            int value = hashMap.get(ch);

            for (int j = 0; j < Math.min(value, repeat); j++) {
                result += ch;
            }

            hashMap.put(ch, value - repeat);

            if (hashMap.get(ch) > 0 && !priorityQueue.isEmpty()) {
                char nextcharacter = priorityQueue.poll();
                result += nextcharacter;
                hashMap.put(nextcharacter, hashMap.get(nextcharacter) - 1);
                if (hashMap.get(nextcharacter) > 0) {
                    priorityQueue.offer(nextcharacter);
                }
                priorityQueue.offer(ch);

            }


        }
        System.out.println(result);


    }
}
