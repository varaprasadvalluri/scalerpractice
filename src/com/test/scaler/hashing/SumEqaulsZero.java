package com.test.scaler.hashing;

public class SumEqaulsZero {
    public static void main(String[] args) {
        int[] arr = {96, -71, 18, 66, -39, -32, -16, -83, -11, -92, 55, 66, 93, 5, 50, -45, 66, -28, 69, -4, -34, -87, -32, 7, -53, 33, -12, -94, -80, -71, 48, -93, 62};
        int sum = 0;
        int j = arr[0];
        sum = j;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) System.out.println("sum is equals -->");
        }
    }
}
