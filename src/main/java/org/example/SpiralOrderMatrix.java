package org.example;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrderMatrix {
    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};

        int rowstart = 0;
        int rowend = matrix.length - 1;
        int colstart = 0;
        int colend = matrix[0].length - 1;
        List<Integer> arr=new ArrayList<>();
        int direction=1;
        while (rowstart <= rowend && colstart <= colend) {

            if(direction==1) {
                for (int j = colstart; j <= colend; j++) {
                    arr.add(matrix[rowstart][j]);
                }
                rowstart++;
                direction=2;
            }
            else if(direction==2)
            {
                for(int i=rowstart;i<=rowend;i++)
                {
                    arr.add(matrix[i][colend]);
                }
                colend--;
                direction=3;
            }
            else if(direction==3)
            {
                for(int j=colend;j>=colstart;j--)
                {
                    arr.add(matrix[rowend][j]);
                }
                rowend--;
                direction=4;
            }
            else if(direction==4)
            {
                for(int i=rowend;i>=rowstart;i--)
                {
                    arr.add(matrix[i][colstart]);
                }
                colstart++;
                direction=1;
            }
            
        }
        int[] example1 = arr.stream().mapToInt(i->i).toArray();
    }
}
