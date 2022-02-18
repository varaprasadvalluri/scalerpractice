package com.test.scaler.array.interviewques;

import com.test.scaler.practces2D.Print2DMatrix;

import java.util.Scanner;

public class StarPattren {
    public static void main(String[] args) {
        int n;//
//        int rowL = n * 2;
//        int colL = n * 2;
//        String[][] mat = new String[rowL][colL];
//        for (int i = n; i >= 0; i--) {
//            for (int j = i; j > 0; j--) {
//                System.out.print("*");
//            }
//            if (i != 0)
//                System.out.println();
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j >= 0; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = n; i >= 0; i--) {
//            for (int j = i; j < n; j++) {
//                System.out.print(" ");
//            }
//            for (int k = i; k > 0; k--) {
//                System.out.print("*");
//            }
//            if (i > 0) System.out.println();
//        }
////        System.out.print("*");
////        System.out.println();
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print(j < n - i ? "*" : " ");//
            for (int j = 0; j < n; j++) System.out.print(j < i ? " " : "*");
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) System.out.print(j <= i ? "*" : " ");
            for (int j = 0; j < n; j++) System.out.print(j < n - 1 - i ? " " : "*");
            System.out.println();
        }

//******** -->8 --> double
//***  *** -->2
//**    **  -->2+2
//*      * -->2+2+2 -->
//*      * -->desc
//**    ** -->
//***  *** -->
//********

//        Print2DMatrix.print2D(mat);
    }
}
