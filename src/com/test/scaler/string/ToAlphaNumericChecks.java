package com.test.scaler.string;

import java.util.Arrays;

public class ToAlphaNumericChecks {
    public static void main(String[] args) {
        char[] chars = {'S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'};
        char[] ans = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (!Character.isLetter(chars[i])) System.out.println("0");
            else ans[i] = chars[i];
        }
        System.out.println("ans ->"+ Arrays.toString(ans));
    }
}
