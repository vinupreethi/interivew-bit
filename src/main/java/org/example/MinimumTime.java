package org.example;

import java.util.PriorityQueue;

class Pairmin {
    int time;
    int first;
    int second;
}

public class MinimumTime {
    public static void main(String args[]) {
        int grid[][] = {{0,1,3,2},{5,1,2,5},{4,3,8,6}};
        int visited[][]=new int[grid.length][grid[0].length];
        PriorityQueue<Pairmin> priorityQueue = new PriorityQueue<>((a, b) -> a.time - b.time);
        Pairmin pairmin = new Pairmin();
        pairmin.time = grid[0][0];
        pairmin.first = 0;
        pairmin.second = 0;
        int direction[][] = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                visited[i][j]=0;
            }
        }
            priorityQueue.offer(pairmin);


        while (!priorityQueue.isEmpty()) {
            Pairmin pairmin1 = priorityQueue.poll();
            int time = pairmin1.time;
            int first = pairmin1.first;
            int second = pairmin1.second;
            visited[first][second]=1;
            for (int dir[] : direction) {
                int newfirst = dir[0] + first;
                int newsecond = dir[1] + second;
                if(newfirst<0 || newsecond<0 || newfirst>= grid.length || newsecond>=grid[0].length)
                    continue;
                if(visited[newfirst][newsecond]==1)
                    continue;
                if(newfirst==grid.length-1 && newsecond==grid[0].length-1)
                {
                    System.out.println(time);
                    return;
                    }
                if(grid[newfirst][newsecond]<=time+1)
                {
                    Pairmin pairmin3=new Pairmin();
                    pairmin3.time=time+1;
                    pairmin3.first=newfirst;
                    pairmin3.second=newsecond;
                    priorityQueue.offer(pairmin3);
                }
                else if(grid[newfirst][newsecond]>time)
                {
                    int waittime = ((grid[newfirst][newsecond]- time) % 2 == 0) ? 1 : 0;
//                    int waittime=grid[newfirst][newsecond]-time;
//                    if(waittime%2==0)
//                    {
//                        waittime=1;
//                    }
//                    else
//                        waittime=0;

                    Pairmin pairmin4=new Pairmin();
                    pairmin4.time=waittime+grid[newfirst][newsecond];
                    pairmin4.first=newfirst;
                    pairmin4.second=newsecond;
                    priorityQueue.offer(pairmin4);
                }



            }


        }
        System.out.println(-1);


    }
}
