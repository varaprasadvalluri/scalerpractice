package com.test.scaler.practces2D;

public class Print2DMatrix {
    public static void print2D(int matrix[][]) {
        System.out.println("The matrix is: ");
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "  ");
            }
            System.out.println();
        }
    }

    public static void print1D(int matrix[]) {
        System.out.println("The matrix is: ");
        for (int row : matrix) {
            System.out.print(row + "  ");
            System.out.println();
        }
    }

    public static void print2D(String matrix[][]) {
        System.out.println("The matrix is: ");
        for (String[] row : matrix) {
            for (String column : row) {
                System.out.print(column + "  ");
            }
            System.out.println();
        }
    }
}
