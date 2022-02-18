package com.test.scaler.practces2D;

public class RowSum2D {

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 2, 3, 4}};
        int colL = mat[0].length;
        int rowL = mat.length;
        int[] ans = new int[rowL];
        for (int i = 0; i < rowL; i++) {
            int sum = 0;
            for (int j = 0; j < colL; j++) {
                System.out.println("mat -->" + mat[i][j]);
                sum += mat[i][j];
            }
            ans[i] = sum;
            System.out.println("sum -->" + sum);
        }
        Print2DMatrix.print1D(ans);
    }
}
