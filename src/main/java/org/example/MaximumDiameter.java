package org.example;

import java.util.*;

public class MaximumDiameter {

    public static void main(String args[]) {
        int edges1[][] = {{0, 1}, {0, 2}, {0, 3}, {2, 4}, {2, 5}, {3, 6}, {2, 7}};
        int edges2[][] = {{0, 1}, {0, 2}, {0, 3}, {2, 4}, {2, 5}, {3, 6}, {2, 7}};
        int n = edges1.length + 1;
        ;
        int m = edges2.length + 1;
        int[] indegree1 = new int[n];
        int[] indegree2 = new int[m];

        List<List<Integer>> adjList1 = new ArrayList<>();
        List<List<Integer>> adjList2 = new ArrayList<>();
        for (int i = 0; i < n; i++)
            adjList1.add(new ArrayList<>());
        for (int j = 0; j < m; j++)
            adjList2.add(new ArrayList<>());
        for (int i = 0; i < n-1; i++) {
            adjList1.get(edges1[i][1]).add(edges1[i][0]);
            adjList1.get(edges1[i][0]).add(edges1[i][1]);
            indegree1[edges1[i][0]]++;
            indegree1[edges1[i][1]]++;
        }

        for (int j = 0; j < m-1; j++) {
            adjList2.get(edges2[j][1]).add(edges2[j][0]);
            adjList2.get(edges2[j][0]).add(edges2[j][1]);
            indegree2[edges1[j][0]]++;
            indegree2[edges1[j][1]]++;
        }
        int first = findMax(indegree1, adjList1);
        int second = findMax(indegree2, adjList2);
        if (first % 2 != 0)
            first = first + 1;
        if (second % 2 != 0)
            second = second + 1;
        System.out.println(first/2 + second/2 +1);

    }

    private static int findMax(int[] indegree, List<List<Integer>> adj) {
        int nodes = indegree.length;
        Queue<Integer> queue = new LinkedList<>();
        for (int k = 0; k < nodes; k++)
            if (indegree[k] == 1)
                queue.offer(k);
        int leaves = 0;
        while (nodes > 2) {
            int size = queue.size();
            nodes -= size;
            leaves++;
            while (size != 0) {
                int answer = queue.poll();
                for (Integer a : adj.get(answer)) {
                    if (indegree[a] == 0)
                        continue;
                    --indegree[a];
                    if (indegree[a] == 1)
                        queue.offer(a);
                }
                size--;
            }


        }
        if (nodes == 2)
            return 2 * leaves + 1;
        return 2 * leaves;


    }
}
