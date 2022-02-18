package com.test.scaler.practces2D;

import static com.test.scaler.practces2D.Print2DMatrix.print2D;

public class MatrixOfMatrixAddOrSubst {
    public static void main(String[] args) {
        int[][] matA = {{6}, {2}, {3},{10},{1},{3}};
        int[][] matB = {{6}, {7}, {3},{8},{1},{2}};
        int colL = matA[0].length;
        int rowL = matA.length;
        int[][] ans = new int[rowL][colL];
        for (int i = 0; i < rowL; i++) {
            int sum = 0;
            for (int j = 0; j < colL; j++) {
                //ans[i][j] = matA[i][j] + matB[i][j];//addition
                ans[i][j] = matA[i][j] - matB[i][j];//substarction
            }
        }
        print2D(ans);
    }
}
