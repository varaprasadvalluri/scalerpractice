package com.test.scaler.practces2D;

public class ColumSum {

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 2, 3, 4}};
        int colL = mat[0].length;
        int rowL = mat.length;
        int[] ans = new int[colL];
        for (int i = 0; i < colL; i++) {
            int sum = 0;
            for (int j = 0; j < rowL; j++) {
                System.out.println("mat -->" + mat[j][i]);
                sum += mat[j][i];
            }
            ans[i] = sum;
            System.out.println("sum -->" + sum);
        }
        Print2DMatrix.print1D(ans);
    }
}
