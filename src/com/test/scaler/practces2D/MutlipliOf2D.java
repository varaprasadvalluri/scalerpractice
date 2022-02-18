package com.test.scaler.practces2D;

public class MutlipliOf2D {
    public static void main(String[] args) {
        int[][] matA = {{1, 2}, {3, 4}};
        int[][] matB = {{5, 6}, {7, 8}};
        int rowAL = matA.length;
        int colAL = matA[0].length;
        int rowBL = matB.length;
        int colBL = matB[0].length;
        int[][] ans = new int[rowAL][colBL];
        for (int i = 0; i < rowAL; i++) {
            for (int j = 0; j < colBL; j++) {
                int sum = 0;
                for (int k = 0; k < rowBL; k++) {
                    sum += (matA[i][k] * matB[k][j]);
                    ans[i][j] = sum;
//                    System.out.println("MatA -->" + matA[i][k] + " matB -->" + (matB[k][j]));
                }
//                System.out.println("sum -->" + sum);
            }
        }
        Print2DMatrix.print2D(ans);
    }
}
