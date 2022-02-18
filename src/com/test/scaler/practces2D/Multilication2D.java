package com.test.scaler.practces2D;

public class Multilication2D {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int B = 2;
        int colL = mat[0].length;
        int rowL = mat.length;
        int[][] ans = new int[rowL][colL];
        for (int i = 0; i < rowL; i++) {
            for (int j = 0; j < colL; j++) {
                ans[i][j] = B * mat[i][j];
            }
        }
        Print2DMatrix.print2D(ans);
    }

}
