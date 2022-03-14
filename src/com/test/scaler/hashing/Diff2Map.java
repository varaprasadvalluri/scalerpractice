package com.test.scaler.hashing;

public class Diff2Map {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3};
        int k = 2;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            j = arr[i] - arr[i + 1];
        }
    }
}
