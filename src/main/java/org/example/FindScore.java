package org.example;

import java.util.*;

class FindScorePair {
    int first;
    int second;
}

public class FindScore {
    public static void main(String args[]) {
        int nums[] = {2, 1, 3, 4, 5, 2};
        PriorityQueue<FindScorePair> priorityQueue = new PriorityQueue<FindScorePair>((a, b) -> {
            if (a.first == b.first)
                return a.second - b.second;
            return a.first - b.first;
        });
        boolean visited[] = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            FindScorePair findScorePair = new FindScorePair();
            findScorePair.first = nums[i];
            findScorePair.second = i;
            priorityQueue.add(findScorePair);
        }
        int ans=0;
        while (!priorityQueue.isEmpty()) {
            FindScorePair answer = priorityQueue.poll();
            if(visited[answer.second]!=true) {
                visited[answer.second] = true;
                ans += answer.first;
                if ((answer.second - 1) >= 0) {
                    visited[answer.second - 1] = true;
                }

                if ((answer.second + 1) <= nums.length - 1) {
                    visited[answer.second + 1] = true;
                }
            }

        }
        System.out.println(ans);


    }
}
