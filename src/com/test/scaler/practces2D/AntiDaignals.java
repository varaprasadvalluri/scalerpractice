package com.test.scaler.practces2D;

import static com.test.scaler.practces2D.Print2DMatrix.print2D;

public class AntiDaignals {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int colL = mat[0].length;
        int rowL = mat.length;
        int[][] ans = new int[rowL * 2 - 1][colL];
        int r = 0;
        for (int j = 0; j < colL; j++) {
            int row = 0, col = j, c = 0;
            while (row < rowL) {
                if (col >= 0) {
                    ans[r][c++] = mat[row][col];//
                } else {
                    ans[r][c++] = 0;
                }
                row++;
                col--;
            }
            r++;
        }
        for (int i = 1; i < rowL; i++) {
            int row = i, col = colL - 1, c = 0;
            while (col >= 0) {
                if (row < rowL) {
                    ans[r][c++] = mat[row][col];
                } else {
                    ans[r][c++] = 0;
                }
                row++;
                col--;
            }
            r++;
        }
        print2D(ans);
    }


}
