package org.example;

import java.util.*;

public class MakingaLargeIsland {
    public static void main(String args[])
    {
        int grid[][]={{1,0,1,1},{0,1,1,0},{1,0,1,0},{1,0,0,1}};
        int numberOfIsland=2;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                if(grid[i][j]==1)
                {

                    grid[i][j]=numberOfIsland;
                    int result=dfsGrid(grid,i,j,numberOfIsland);
                    hashMap.put(numberOfIsland,result);
                    numberOfIsland++;
                }
            }
        }
        int result=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                Set<Integer> set=new HashSet<>();
                if(grid[i][j]==0)
                {
                    int answer=1;
                    int direction[][]={{0,1},{0,-1},{1,0},{-1,0}};
                    for (int dir[] : direction) {
                        int row = dir[0] + i;
                        int col = dir[1] + j;
                        if (row < 0 || col < 0 || row >= grid.length || col >= grid.length)
                            continue;
                        if(!set.contains(grid[row][col]) && grid[row][col]!=0)  {
                            answer += hashMap.get(grid[row][col]);
                            set.add(grid[row][col]);
                        }
                    }
                    result=Math.max(answer,result);
                }
            }
        }
        System.out.println(result);
    }

    private static int dfsGrid(int[][] answer, int row, int col,int number) {
        int direction[][]={{0,1},{0,-1},{1,0},{-1,0}};
        Queue<int[]> queue=new LinkedList<>();
        queue.offer(new int[]{row,col});
        int result=0;
        while(!queue.isEmpty()) {
            int answer1[]=queue.poll();
            result++;
            for (int dir[] : direction) {
                row = dir[0] + answer1[0];
                col = dir[1] + answer1[1];
                if (row < 0 || col < 0 || row >= answer.length || col >= answer.length)
                    continue;

                if(answer[row][col]==1) {
                    answer[row][col] = number;
                    queue.offer(new int[]{row,col});
                }

            }
        }
        return result;
    }
}
