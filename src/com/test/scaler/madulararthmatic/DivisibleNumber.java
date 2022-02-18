package com.test.scaler.madulararthmatic;

public class DivisibleNumber {
    public static void main(String[] args) {
        String str = "123";
        int n = str.length();
        int oddDigSum = 0, evenDigSum = 0;
        for (int i = 0; i < n; i++) {
            // When i is even, position of digit is odd
            if (i % 2 == 0)
                oddDigSum += (str.charAt(i) - '0');
            else
                evenDigSum += (str.charAt(i) - '0');
        }

        // Check its difference is divisible by 11 or not
        System.out.println("divisble ->" + ((oddDigSum - evenDigSum) % 8 == 0));
    }
}
