package com.test.scaler.practces2D;

public class RotateArray {

    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        int colL = mat[0].length;
        int rowL = mat.length;
        int[][] ans = new int[rowL][colL];

        for (int r = 0; r < rowL; r++) {
            for (int c = r + 1; c < colL; c++) {
                //transpose of the rows
                int temp = mat[r][c];
                mat[r][c] = mat[c][r];
                mat[c][r] = temp;
            }
        }
        for (int i = 0; i < colL; i++) {
            int l = 0, h = rowL - 1;
            while (l < h) {
                //reverse the matrix
                int temp = mat[i][l];
                mat[i][l] = mat[i][h];
                mat[i][h] = temp;
                l++;
                h--;
            }
        }
        Print2DMatrix.print2D(mat);

    }
}
