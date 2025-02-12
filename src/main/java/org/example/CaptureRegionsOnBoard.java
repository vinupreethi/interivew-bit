package org.example;

import java.util.Arrays;

public class CaptureRegionsOnBoard {
    public static void main(String args[]) {
        char[][] board = {{'O', 'X', 'X', 'O', 'X' },
                {'X', 'O', 'O', 'X', 'O' },
                {'X', 'O', 'X', 'O', 'X' },
                {'O', 'X', 'O', 'O', 'O' },
                {'X', 'X', 'O', 'X', 'O' }};

//        [["O","X","X","O","X"],
//        ["X","X","X","X","O"],
//        ["X","X","X","O","X"],
//        ["O","X","O","O","O"],
//        ["X","X","O","X","O"]]
        boolean visited[][] = new boolean[board.length][board[0].length];

        int n = board.length;
        int m = board[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                visited[i][j] = true;
            }
        }
        for (int j = 0; j < m; j++) {
            if (board[0][j] == 'O' && visited[0][j] == true) {
                Dodfs(0, j, board, visited);
            }
            if (board[n - 1][j] == 'O' && visited[n - 1][j] == true) {
                Dodfs(n - 1, j, board, visited);
            }
        }
        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O' && visited[i][0] == true) {
                Dodfs(i, 0, board, visited);
            }
            if (board[i][m - 1] == 'O' && visited[i][m - 1] == true) {
                Dodfs(i, m - 1, board, visited);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(visited[i][j]==true)
                    board[i][j]='X';
                else
                    board[i][j]='O';
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }


    }

    private static void Dodfs(int i, int j, char[][] board, boolean[][] visited) {
        int direction[][] = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        if (visited[i][j] == false)
            return;
        if (board[i][j] == 'X')
            return;
        visited[i][j] = false;
        for (int dir[] : direction) {
            int x = i + dir[0];
            int y = j + dir[1];
            if (x < 0 || y < 0 || x >= board.length || y >= board[0].length)
                continue;
            if (visited[x][y] == true && board[i][j]=='O')
                Dodfs(x, y, board, visited);
        }


    }


}

