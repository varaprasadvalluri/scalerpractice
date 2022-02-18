package com.test.scaler.practces2D;

public class MainDaignalSum {

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rowL = mat.length;
        int colL = mat[0].length;
        int sum = 0;
        for (int r = 0; r < rowL; r++) {
            for (int c = 0; c < colL; c++) {
                if (r == c) {
                    sum += mat[r][c];
                    System.out.println(" r -->" + mat[r][c]);
                    break;
                }
            }
        }
        System.out.println("sum -->" + sum);
    }
}
