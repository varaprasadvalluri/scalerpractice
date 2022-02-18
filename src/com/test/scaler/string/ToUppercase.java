package com.test.scaler.string;

import java.util.Arrays;

public class ToUppercase {
    public static void main(String[] args) {
        char[] chars = {'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
//         ['s', 'c', 'a', 'l', 'e', 'r', 'a', 'c', 'a', 'd', 'e', 'm', 'y']
        char[] ans = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i])) ans[i] = Character.toUpperCase(chars[i]);
            else ans[i] = chars[i];
        }
        System.out.println("ans ->"+ Arrays.toString(ans));
    }
}
