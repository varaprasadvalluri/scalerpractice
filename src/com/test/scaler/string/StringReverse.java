package com.test.scaler.string;

import java.util.Arrays;
import java.util.List;

public class StringReverse {

    public static void main(String[] args) {
        String str = "Apple red";
        char[] chars = str.toCharArray();
        int start = 0, end = str.length() - 1;
        while (start < end) {
            char ch = chars[start];
            chars[start] = chars[end];
            chars[end] = ch;
            start++;
            end--;
        }
        String ans = String.valueOf(chars);
        System.out.println("char -->" + Arrays.toString(chars) + " ans ->" + new String(chars));
    }
}
