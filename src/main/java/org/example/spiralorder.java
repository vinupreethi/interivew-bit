package org.example;

import java.util.ArrayList;
import java.util.List;

public class spiralorder {
    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        List<Integer> result = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = m - 1;
        System.out.println("n = " + n);
        System.out.println("m = " + m);
        while (startCol <= endCol && startRow <= endRow) {
            for (int j = startCol; j <= endCol; j++) {
                result.add(matrix[startRow][j]);
            }
            startRow++;

            System.out.println("result1: " + result);
            for (int i = startRow; i <= endRow; i++) {
                result.add(matrix[i][endCol]);
            }
            endCol--;
            System.out.println("result2: " + result);
            for (int j = endCol; j >= startCol; j--) {
                result.add(matrix[endRow][j]);
            }
            endRow--;
            System.out.println("result3: " + result);
            for (int i = endRow; i >= startRow; i--) {
                result.add(matrix[i][startCol]);

            }
            startCol++;
            System.out.println("result4: "+result);
        }
            System.out.println(result);


        System.out.println(result);

        int row = matrix.length;
        int col = matrix[0].length;
        int top = 0;
        int bottom = row - 1;
        int right = col - 1;
        int left = 0;
        int direction = 0;
        int[] spiralArray = new int[row * col];
        int count = 0;

        while (left <= right && top <= bottom){
            //going from left to right
            if(direction == 0){
                for(int i = left; i <= right; i++){
                    spiralArray[count] = matrix[top][i];
                    count++;
                }
                top++;
                direction = 1;
            }
            //going from top to bottom
            else if(direction == 1 ){
                for(int i = top; i <= bottom; i++){
                    spiralArray[count] = matrix[i][right];
                    count++;
                }
                right--;
                direction = 2;
            }
            //going from right to left
            else if(direction == 2 ){
                for(int i = right; i >= left; i--){
                    spiralArray[count] = matrix[bottom][i];
                    count++;
                }
                bottom--;
                direction = 3;
            }
            else if(direction == 3){
                for(int i = bottom; i >= top; i--){
                    spiralArray[count] = matrix[i][left];
                    count++;
                }
                left++;
                direction = 0;
            }
        }
        for(int i=0;i<n*m;i++)
            System.out.println("spiralArray = " + spiralArray[i]);

        }

    }
