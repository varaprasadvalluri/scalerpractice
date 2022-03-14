package com.test.scaler.string;

import java.util.Arrays;
import java.util.Iterator;

public class StringOpration {
    public static void main(String[] args) {
        //
//        First concatenate the string with itself so string A becomes "AbcaZeoBAbcaZeoB".
//                Delete all the uppercase letters so string A becomes "bcaeobcaeo".
//                Now replace vowel with '#'.
//                A becomes "bc###bc###".
        String str = "AbcaZeoB";
        str += str;
        char[] arr = str.toCharArray();
//        Character.isUpperCase()
        StringBuilder ans = new StringBuilder();
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int start = 0, end = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') ans.append('#');
            else if (!upperCase.contains(String.valueOf(arr[i])))
                ans.append(arr[i]);
        }
        System.out.println("ans -->" + ans + " arr -->" + Arrays.toString(arr));
    }
}
