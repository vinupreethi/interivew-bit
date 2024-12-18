package org.example;

import java.util.Arrays;
import java.util.PriorityQueue;

class PairObs {
    int weight;
    int first;
    int second;
}

public class MinimumObstacles {
    public static void main(String args[]) {

        int[][] grid = {{0, 1, 1}, {1, 1, 0}, {1, 1, 0}};
        int[][] result = new int[grid.length][grid[0].length];
        int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int[][] visited=new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                result[i][j] = Integer.MAX_VALUE;
                visited[i][j]=0;
            }
        }

        PriorityQueue<PairObs> pq = new PriorityQueue<>((a, b) -> a.weight - b.weight);
        PairObs pairObs = new PairObs();
        pairObs.weight = grid[0][0];
        pairObs.first = 0;
        pairObs.second = 0;
        pq.offer(pairObs);
        while (!pq.isEmpty()) {
            PairObs pairObs1 = pq.poll();
            int obstacles = pairObs1.weight;
            int first = pairObs1.first;
            int second = pairObs1.second;
            visited[first][second]=1;
            if (first == grid.length - 1 && second == grid[0].length - 1) {

                break;

            }
            for (int[] directions : dir) {
                int newfirst = first + directions[0];
                int newsecond = second + directions[1];

                if (newfirst < 0 || newsecond < 0 || newfirst >= grid.length || newsecond >= grid[0].length)
                    continue;
                int newobstacles = obstacles + grid[newfirst][newsecond];
                if (newobstacles  < result[newfirst][newsecond] && visited[newfirst][newsecond]!=1) {
                    result[newfirst][newsecond] = newobstacles;
                    PairObs push1 = new PairObs();
                    push1.weight = newobstacles;
                    push1.first = newfirst;
                    push1.second = newsecond;
                    pq.offer(push1);

                }

            }


        }
        System.out.println(result[grid.length - 1][grid[0].length - 1]);


    }
}
