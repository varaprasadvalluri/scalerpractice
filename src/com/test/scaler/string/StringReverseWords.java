package com.test.scaler.string;

import java.util.Arrays;

public class StringReverseWords {
    public static void main(String[] args) {
        String str = "crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv ";
        String[] strWords = str.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int s = strWords.length - 1; s >= 0; s--) {
            if (ans.toString().isEmpty())
                ans.append(strWords[s]);
            else ans.append(" ").append(strWords[s]);
        }
        System.out.println("ans ->" + ans.toString());
    }
}
