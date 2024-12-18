package org.example;

import java.util.*;

public class SlidingPuzzleHard {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int board[][] = new int[2][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = scanner.nextInt();
            }
        }
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        String target = "123450";
        for (int i = 0; i < 6; i++)
            adj.add(new ArrayList<>());
        adj.get(0).add(1);
        adj.get(0).add(3);
        adj.get(1).add(2);
        adj.get(1).add(4);
        adj.get(1).add(0);
        adj.get(2).add(1);
        adj.get(2).add(5);
        adj.get(3).add(0);
        adj.get(3).add(4);
        adj.get(4).add(1);
        adj.get(4).add(3);
        adj.get(4).add(5);
        adj.get(5).add(2);
        adj.get(5).add(4);
        System.out.println(adj);
        StringBuilder startstate = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                startstate.append(board[i][j]);
            }
        }

        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.add(String.valueOf(startstate));
        visited.add(String.valueOf(startstate));
        int moves = 0;
        int flag=0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size != 0) {
                startstate= new StringBuilder(queue.poll());
                int zeroindex=startstate.indexOf("0");
                System.out.println(startstate);
                if(startstate.toString().equals(target))
                {
                    System.out.println(moves);
                }
                for(Integer i: adj.get(zeroindex))
                {
                    String ans=swapping(zeroindex,i,new StringBuilder(startstate));
                    if(visited.contains(ans))
                        continue;
                    visited.add(ans);
                    queue.add(ans);

                }
                size--;
            }
            moves++;
        }
        if(flag==1)
            System.out.println(moves);
        else
            System.out.println(-1);

    }

    public static String swapping(int nonzero, int zero, StringBuilder str) {
        char a = str.charAt(zero);
        char b = str.charAt(nonzero);
        str.setCharAt(zero, b);
        str.setCharAt(nonzero, a);
        return str.toString();
    }
}
