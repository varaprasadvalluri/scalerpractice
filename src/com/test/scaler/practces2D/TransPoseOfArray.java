package com.test.scaler.practces2D;


import static com.test.scaler.practces2D.Print2DMatrix.print2D;

public class TransPoseOfArray {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int colL = mat[0].length;
        int rowL = mat.length;
        int[][] ans = new int[colL][rowL];
        for (int i = 0; i < rowL; i++) {
            for (int j = 0; j < colL; j++) {
                ans[j][i] = mat[i][j];
            }
        }
        Print2DMatrix.print2D(ans);
    }


}

