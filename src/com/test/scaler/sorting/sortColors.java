package com.test.scaler.sorting;

import java.util.Arrays;

public class sortColors {
    public static void main(String[] args) {
        int[] A = {1, 2, 4};
        int left = 0, right = A.length - 1, curr = 0;
        while (curr <= right) {
            if (A[curr] == 0) {
                swap(A, curr++, left++);
            } else if (A[curr] == 2) {
                swap(A, curr, right--);
            } else curr++;
        }
        System.out.println("arr ->" + Arrays.toString(A));
    }


    public static void swap(int[] A, int p1, int p2) {
        int temp = A[p1];
        A[p1] = A[p2];
        A[p2] = temp;
    }
}
