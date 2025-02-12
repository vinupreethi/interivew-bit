package org.example;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class WordSearchBoard {
    public static void main(String args[]) {
        String board[] = {
                "ABCE",
                "SFCS",
                "ADEE"
        };
        String words[]={"ABCCED","SEE","ABCB","ABFSAB","ABCD"};
        for(int i=0;i<words.length;i++)
        {
            boolean answer=CheckWord(words[i],board);
            System.out.println(answer);
        }


    }

    private static boolean CheckWord(String word,String board[]) {
        int dir[][]={{-1,0},{1,0},{0,-1},{0,1}};
        int cnt=0;
        Queue<int []> queue=new LinkedList<>();
        boolean[][] visited = new boolean[board.length][board[0].length()];
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length();j++)
            {
                if(board[i].charAt(j)==(word.charAt(cnt)))
                {
                    queue.offer(new int[]{i,j});
                }
            }
        }

        cnt++;
        while(!queue.isEmpty())
        {
            int size=queue.size();
            for(int k=0;k<size;k++) {
                int answer[] = queue.poll();
                int i = answer[0];
                int j = answer[1];
                visited[i][j]=true;
                for (int direction[] : dir) {
                    if (cnt == word.length())
                        return true;
                    int newI = i + direction[0];
                    int newJ = j + direction[1];
                    if (newI < 0 || newJ < 0 || newI >= board.length || newJ >= board[i].length())
                        continue;
                    if(visited[newI][newJ]==true)
                        continue;;
                    if (board[newI].charAt(newJ) == (word.charAt(cnt))) {
                        queue.offer(new int[]{newI, newJ});
                        //visited[newI][newJ] = true;
                    }
                }
            }
            cnt++;

        }
        return false;
    }
}
