package org.example;

import java.util.*;

public class MaximumNumberOfKedges {
    public static void main(String args[]) {
        int[][] edges = {{0, 2}, {1, 2}, {1, 3}, {2, 4}};
        int n = 5;
        int values[] = {1,8,1,4,4};
        int k = 6;
        int[] indegree = new int[n];

        List<List<Integer>> adjList = new ArrayList<>();
        for (int j = 0; j < n; j++)
            adjList.add(new ArrayList<>());
        for (int i = 0; i < edges.length; i++) {
            adjList.get(edges[i][0]).add(edges[i][1]);
            adjList.get(edges[i][1]).add(edges[i][0]);
            indegree[edges[i][0]]++;
            indegree[edges[i][1]]++;
        }

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < indegree.length; i++)
            if (indegree[i] == 1)
                queue.offer(i);

        int cnt = 0;
        while (!queue.isEmpty()) {
            long ans = 0L;
            int answer = queue.poll();
            --indegree[answer];
            if (values[answer] % k == 0) {
                cnt++;
                ans = 0L;
            } else {
                ans = values[answer];
            }
            for (Integer i : adjList.get(answer)) {
                if (indegree[i] == 0)
                    continue;
                --indegree[i];
                if (indegree[i] == 1)
                    queue.add(i);

                values[i] += ans;
            }


        }
        System.out.println(cnt);

    }
}
