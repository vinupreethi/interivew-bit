/*


package org.example;

import java.util.Scanner;

class Board {
    char grid[][];

    Board(int gridsize) {
        this.grid = new char[gridsize][gridsize];
        initializeGrid();
    }

    private void initializeGrid() {
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid.length; column++) {
                grid[row][column] = ' ';
            }
        }
    }

    public void placePlayer(int row, int column, Player player) {
        if (grid[row][column] == ' ') {
            grid[row][column] = player.piece;
            boolean winner=checkPlayerWin(player, row, column);
            System.out.println("Winner is ");
        }
        else
            System.out.println("Piece is already being placed..!");


    }

    public boolean checkPlayerWin(Player player, int row, int column) {
        boolean horizontalcheck = checkHorizontally(player, row);
        boolean verticalcheck = checkVertically(player, column);
        boolean leftdiagonal = checkLeftDiagonally(player);
        boolean rightdiagonal = checkRightDiagonally(player);
        return horizontalcheck || verticalcheck || leftdiagonal || rightdiagonal;

    }

    private boolean checkRightDiagonally(Player player) {
        for (int diagonal = 0; diagonal < grid.length; diagonal++) {
            if (player.piece != grid[diagonal][grid.length - diagonal - 1])
                return false;
        }
        return true;


    }

    private boolean checkLeftDiagonally(Player player) {
        for (int diagonal = 0; diagonal < grid.length; diagonal++) {
            if (player.piece != grid[diagonal][diagonal])
                return false;
        }
        return true;

    }

    private boolean checkVertically(Player player, int column) {
        for (int row = 0; row < grid.length; row++) {
            if (player.piece != grid[row][column])
                return false;
        }
        return true;
    }

    private boolean checkHorizontally(Player player, int row) {
        for (int column = 0; column < grid.length; column++) {
            if (player.piece != grid[row][column])
                return false;
        }
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print("|" + grid[i][j] + "| ");
            }
            System.out.println();
        }
    }


}

class Player {
    Character piece;

    Player(Character piece) {
        this.piece = piece;
    }
}

public class TicTacToe {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the grid size: ");
        int n = scanner.nextInt();
        Board board = new Board(n);

        System.out.println("Please select the piece for Player 1 : ");
        String piece1 = scanner.nextLine();
        Player player1 = new Player(piece1.charAt(0));

        System.out.println("Please select the piece for Player 2 : ");
        String piece2 = scanner.nextLine();
        Player player2 = new Player(piece2.charAt(0));

        int toggle = 0;
        for (int playerturn = 0; playerturn < n * n; playerturn++) {
            if (toggle == 0) {
                System.out.println("Player 1 Turn: ");
                System.out.println("Enter the row: ");
                int row = scanner.nextInt();
                System.out.println("Enter the column: ");
                int column = scanner.nextInt();
                board.placePlayer(row, column, player1);
                toggle = 1;
            } else {
                System.out.println("Player 2 Turn: ");
                System.out.println("Enter the row: ");
                int row = scanner.nextInt();
                System.out.println("Enter the column: ");
                int column = scanner.nextInt();
                board.placePlayer(row, column, player2);
                toggle = 0;
            }
        }


    }
}


*/
