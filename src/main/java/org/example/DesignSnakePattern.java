/*


package org.example;

import java.util.LinkedList;
import java.util.Random;


class Board {
    LinkedList<Cell> snake = new LinkedList<>();

    Board(int noOfRows, int noOfColumns) {
        Cell head = new Cell(0, 0);
        head.cellType = CellType.SNAKE;
        snake.add(head);
    }


    public void addFoodInBoard(int randomRow, int randowColumn) {
        Cell foodtobeAdded = new Cell(randomRow, randowColumn);
        foodtobeAdded.cellType = CellType.FOOD;

    }

    public void removeFoodFromBoard(Cell cell) {
        cell.cellType = CellType.EMPTY;
    }
}

enum CellType {
    FOOD, EMPTY, SNAKE;
}

class User {
    int LEFT_DIRECTION = -1;
    int RIGHT_DIRECTION = 1;
    int UP_DIRECTION = 1;
    int DOWN_DIRECTION = -1;

    public void pressUp(Cell cell) {
        int row=cell.getRow();
        row=row+UP_DIRECTION;


    }

    public void pressDown(Cell cell) {
        int row=cell.getRow();
        row=row+LEFT_DIRECTION;

    }

    public void pressLeft(Cell cell) {

    }

    public void pressRight(Cell cell) {

    }
}

class Cell {
    int row;
    int column;
    CellType cellType;

    Cell(int rows, int columns) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public CellType getCellType() {
        return cellType;
    }

    public void setCellType(CellType cellType) {
        this.cellType = cellType;
    }
}

class Snake {
    LinkedList<Cell> snake = new LinkedList<>();
    Cell head;

    Snake() {
        this.head = new Cell(0, 0);
        this.head.cellType = CellType.SNAKE;


    }

    public void growSnake(Cell cell) {
        cell.cellType = CellType.SNAKE;
        snake.add(cell);
    }

    public void removeLastNode(Cell cell) {
        cell.cellType = CellType.EMPTY;
        snake.remove(cell);
    }
}

class Game {
    Board board;
    LinkedList<Integer> snake = new LinkedList<>();
    Cell cell;
    User user = new User();


    public boolean generateFood() {

        Random random = new Random();
        int randomRow = random.nextInt(cell.noOfrows) + 1;
        int randowColumn = random.nextInt(cell.noOfcolumns) + 1;
        Cell cell = new Cell(randomRow, randowColumn);
        if (cell.cellType == CellType.EMPTY) {
            board.addFoodInBoard(randomRow, randowColumn);
            return true;
        }
        return false;
    }

    public void SnakeConsumedFood(Cell cell) {
        board.removeFoodFromBoard(cell);
        while (!generateFood()) {
            generateFood();
        }
    }

    public void snakeisMoving() {
        if (user.pressDown()) {

        }


    }

    public boolean SnakeGetsCrashed() {
        return true;
    }


}

public class DesignSnakePattern {
    public static void main(String args[]) {

    }
}


*/
