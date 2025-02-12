package org.example;

public class PacificAtlanticFlow {
    public static void main(String args[]) {
        int grid[][] = {{1, 2, 2, 3, 5}, {3, 2, 3, 4, 4}, {2, 4, 5, 3, 1}, {6, 7, 1, 4, 5}, {5, 1, 1, 2, 4}};
        boolean atlantic[][] = new boolean[grid.length][grid[0].length];
        boolean pacific[][] = new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i == 0 || j == 0)
                    dfsFlow(atlantic, 0, grid, i, j);
                if (i == grid.length - 1 || j == grid[0].length - 1)
                    dfsFlow(pacific, 0, grid, i, j);
            }
        }
        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

    private static void dfsFlow(boolean[][] sea, int previous, int[][] grid, int row, int col) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length)
            return;
        if (previous > grid[row][col])
            return;
        if (sea[row][col])
            return;
        sea[row][col] = true;
        dfsFlow(sea, grid[row][col], grid, row + 1, col);
        dfsFlow(sea, grid[row][col], grid, row - 1, col);
        dfsFlow(sea, grid[row][col], grid, row, col + 1);
        dfsFlow(sea, grid[row][col], grid, row, col - 1);

    }
}
