package com.test.scaler.practces2D;

import java.util.HashSet;
import java.util.Set;

public class RowtoColumsZero {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 0}, {9, 2, 0, 4}};
        int colL = mat[0].length;
        int rowL = mat.length;
        boolean isZeroFound = false;
        Set<Integer> rowList = new HashSet<>();
        Set<Integer> colList = new HashSet<>();

        for (int r = 0; r < rowL; r++) {
            for (int c = 0; c < colL; c++) {
                System.out.println(" mat -->" + mat[r][c]);
                if (mat[r][c] == 0) {
                    rowList.add(r);
                    colList.add(c);
                }
            }
        }

        int[][] ans = new int[rowL][colL];
        for (int r = 0; r < rowL; r++) {
            for (int c = 0; c < colL; c++) {
                ans[r][c] = mat[r][c];
            }
        }
        for (int r : rowList) {
            for (int row = 0; row < colL; row++) {
                ans[r][row] = 0;
            }
        }
        for (int c : colList) {
            for (int col = 0; col < rowL; col++) {
                ans[c][col] = 0;
            }
        }
        Print2DMatrix.print2D(ans);
    }
}
