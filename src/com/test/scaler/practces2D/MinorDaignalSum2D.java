package com.test.scaler.practces2D;

public class MinorDaignalSum2D {
    public static void main(String[] args) {
        int[][] mat = {{3, 2}, {2, 3}};
        int colL = mat[0].length;
        int rowL = mat.length;
        int[][] ans = new int[rowL][colL];
        int sum=0;
        for (int i = 0; i < rowL; i++) {
            int row = i, col = colL - 1;
            sum = 0;
            while (row < rowL && col >= 0) {
                System.out.println("  mat -->" + mat[row][col] + " row -->" + row + " col -->" + col);
                sum += mat[row][col];
                row++;
                col--;
            }

            System.out.println("sum -->" + sum);
            break;
        }
        Print2DMatrix.print2D(ans);
    }

}

