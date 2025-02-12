package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MeetingRooms {
    public static void main(String args[]) {
        int a[][] = {{1, 18},
                {18, 23},
                {15, 29},
                {4, 15},
                {2, 11},
                {5, 13}
        };

        Arrays.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                return o1[0] - o2[0];

            }

        });
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < a.length; i++) {
            int start = a[i][0];
            int end = a[i][1];
            while(!priorityQueue.isEmpty() && priorityQueue.peek() <= start) {
                priorityQueue.poll();
            }

            priorityQueue.add(end);
        }
        System.out.println(priorityQueue.size());

    }
}
