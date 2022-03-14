package com.test.scaler.recursion;

public class StringPolindrom {
    public static void main(String[] args) {
        String str = "BALAB";

    }

    static boolean isValidPol(String str, int s, int e, int[] memo) {

        if (s >= e) return true;
//        if (memo[e] == 0) memo[e] = isValidPol(s + 1, s - 1, memo);
        return false;
    }
}
