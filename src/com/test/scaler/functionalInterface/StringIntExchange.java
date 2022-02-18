package com.test.scaler.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringIntExchange {

    public static void main(String[] args) {

        String str = "Apple";
        char[] chars = str.toCharArray();
        Integer[] arr = {1, 2, 3, 4};
        List<Integer> charsList = Arrays.asList(arr);
        int bSum = charsList.stream().mapToInt(Integer::intValue).sum();
        int start = 0, end = str.length() - 1;
        while (start < end) {
            char ch = chars[start];
            chars[start] = chars[end];
            chars[end] = ch;
            start++;
            end--;
        }
        String ans = String. valueOf(chars);
        System.out.println("char -->"+Arrays.toString(chars)+" ans ->"+ans);
    }
}
