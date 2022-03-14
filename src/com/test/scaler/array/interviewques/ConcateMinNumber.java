package com.test.scaler.array.interviewques;

public class ConcateMinNumber {
    public static void main(String[] args) {
        int A = 10, B = 20, C = 30;
        int min = Integer.MAX_VALUE;
        int Amin = Math.min(min, A + B + C);
        int Bmin = Math.min(min, B + C + A);
//        int Bmin = Math.min(min, C + B + A);
    }
}
