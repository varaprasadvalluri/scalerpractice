package com.test.scaler.practces2D;

public class Spiral2D {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = new int[n][n];
        // Normal Case
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;
        int num = 1; //change
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i++) {
                System.out.println("inside col start -->"+num);
                matrix[rowStart][i] = num++; //change
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.println("inside row start -->"+num);
                matrix[i][colEnd] = num++; //change
            }

            colEnd--;
            for (int i = colEnd; i >= colStart; i--) {
                System.out.println("inside col end -->"+num);
                if (rowStart <= rowEnd)
                    matrix[rowEnd][i] = num++; //change
            }
            rowEnd--;
            for (int i = rowEnd; i >= rowStart; i--) {
                System.out.println("inside row end -->"+num);
                if (colStart <= colEnd)
                    matrix[i][colStart] = num++; //change
            }
            colStart++;
        }
        Print2DMatrix.print2D(matrix);
    }
}
