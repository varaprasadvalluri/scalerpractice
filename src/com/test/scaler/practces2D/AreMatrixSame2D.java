package com.test.scaler.practces2D;

public class AreMatrixSame2D {
    public static void main(String[] args) {
        int[][] matA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matB = {{1, 2, 3}, {7, 8, 9}, {4, 5, 6}};
        int colAL = matA[0].length;
        int rowAL = matA.length;
        int colBL = matB[0].length;
        int rowBL = matB.length;
        if (rowAL != rowBL) System.out.println("not matched");
        for (int r = 0; r < rowAL; r++) {
            for (int c = 0; c < colAL; c++) {
                if (matA[r][c] != matB[r][c])
                    System.out.println("not macthed -->");
                System.out.println("matA -->" + matA[r][c] + " matB -->" + matB[r][c]);
            }
        }
    }
}
