/*

package org.example;

import java.util.LinkedList;
import java.util.Random;


class Board {
    int row;
    int column;
    Cell[][] grid;

    Board(int row, int column, CellType cellType) {
        this.row = row;
        this.column = column;
        grid = new Cell[row][column];

    }

    void initializeGrid() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                grid[i][j] = new Cell(i, j, CellType.EMPTY);
            }
        }
    }

    boolean generateFood(int row, int column) {
        if (grid[row][column].celltype == CellType.EMPTY) {
            return true;
        }
        return false;
    }
}

enum CellType {
    FOOD, EMPTY, SNAKE;
}

class Cell {
    int row;
    int column;
    CellType celltype;

    Cell(int row, int column, CellType cellType) {
        this.row = row;
        this.column = column;
        this.celltype = cellType;
    }

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

}

enum UserInput {
    UP, DOWN, LEFT, RIGHT;
}

class User {
    int LEFT_DIRECTION = -1;
    int RIGHT_DIRECTION = 1;
    int TOP_DIRECTION = 1;
    int DOWN_DIRECTION = -1;

    Cell MoveUp(Cell currentCell) {
        Cell newCell = new Cell(currentCell.getRow(), currentCell.getColumn() + TOP_DIRECTION);
        return newCell;
    }

    Cell MoveDown(Cell currentCell) {
        Cell newCell = new Cell(currentCell.getRow(), currentCell.getColumn() + DOWN_DIRECTION);
        return newCell;
    }

    Cell MoveLeft(Cell currentCell) {
        Cell newCell = new Cell(currentCell.getRow() + LEFT_DIRECTION, currentCell.getColumn());
        return newCell;
    }

    Cell MoveRight(Cell currentCell) {
        Cell newCell = new Cell(currentCell.getRow() + RIGHT_DIRECTION, currentCell.getColumn());
        return newCell;
    }
}

class Game {
    LinkedList<Cell> snake;
    Board board;
    Cell snakeCell;


    Game(int totalRows, int totalColumns) {
        this.board = new Board(totalRows, totalColumns, CellType.EMPTY);
        this.snakeCell = new Cell(0, 0, CellType.SNAKE);
        this.snake.add(snakeCell);

    }

    public void generateFood() {
        Random random = new Random();
        int randomRow = random.nextInt(board.row) + 1;
        int randowColumn = random.nextInt(board.column) + 1;
        while (!board.generateFood(randomRow, randowColumn)) {
            board.grid[randomRow][randowColumn].celltype = CellType.FOOD;

        }
    }


    public void SnakeIsMoving(Cell currentcell, User user, String direction) {
        if (UserInput.UP.equals(direction)) {
            Cell newCell = user.MoveDown(currentcell);
            if (isGameOver(newCell))
                return;
            board.grid[newCell.row][newCell.column].celltype=CellType.SNAKE;
            snake.add(newCell);
            Cell lastCell=snake.removeLast();
            board.grid[lastCell.row][lastCell.column].celltype=CellType.EMPTY;

        } else if (UserInput.DOWN.equals(direction)) {
            Cell newCell = user.MoveUp(currentcell);
            if (isGameOver(newCell))
                return;
            board.grid[newCell.row][newCell.column].celltype=CellType.SNAKE;
            snake.add(newCell);
            Cell lastCell=snake.removeLast();
            board.grid[lastCell.row][lastCell.column].celltype=CellType.EMPTY;
        } else if (UserInput.LEFT.equals(direction)) {
            Cell newCell = user.MoveLeft(currentcell);
            if (isGameOver(newCell))
                return;
            board.grid[newCell.row][newCell.column].celltype=CellType.SNAKE;
            snake.add(newCell);
            Cell lastCell=snake.removeLast();
            board.grid[lastCell.row][lastCell.column].celltype=CellType.EMPTY;
        } else if (UserInput.RIGHT.equals(direction)) {
            Cell newCell = user.MoveRight(currentcell);
            if (isGameOver(newCell))
                return;
            board.grid[newCell.row][newCell.column].celltype=CellType.SNAKE;
            snake.add(newCell);
            Cell lastCell=snake.removeLast();
            board.grid[lastCell.row][lastCell.column].celltype=CellType.EMPTY;
        }



    }

    public boolean isGameOver(Cell cell) {
        if (cell.getRow() < 0 || cell.getRow() >= board.row || cell.getColumn() < 0 || cell.getColumn() >= board.column) {
            System.out.println("Snake moved out of the Grid..!");
            return true;
        }
        for (Cell c : snake) {
            if (c.getRow() == cell.getRow() && c.getColumn() == cell.getColumn()) {
                System.out.println("Snake crashed into itself..!");
                return true;
            }
        }
        return false;

    }


}

public class DesignSnakeGame {
    public static void main(String args[]) {
        Game game = new Game(10, 10);
        User user = new User();
        game.board.initializeGrid();
        game.generateFood(); // Generate initial food




    }
}

*/
