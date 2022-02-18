package com.test.scaler.array.interviewques;

public class BinaryArr {
    public static void main(String[] args) {
        String str = "111011101";
        char[] chars = str.toCharArray();
        int ans = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') count++;
        }
        if (count == chars.length) System.out.println("count is equals -->");
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                int L = 0, R = 0;
                for (int j = i - 1; j >= 0; j--) {
                    if (chars[j] == '1') L++;
                    else break;
                }
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[j] == '1') R++;
                    else break;
                }
                if (count > L + R)
                    ans = Math.max(ans, L + R + 1);
                else ans = Math.max(ans, L + R);
            }
        }
        System.out.println("conse ones -->" + ans);
    }
}
