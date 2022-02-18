package com.test.scaler.bitwise;

import java.math.BigInteger;

public class SumBits {
    public static void main(String[] args) {

        String s1 = "1101";
        String s2 = "11";
        int i = s1.length() - 1, j = s2.length() - 1, sum = 0, carry = 0;
        StringBuilder str = new StringBuilder();
        while (i >= 0 || j >= 0) {
            int bit1 = (i >= 0) ? s1.charAt(i--) - '0' : 0; //
            int bit2 = (j >= 0) ? s2.charAt(j--) - '0' : 0;
            sum = carry ^ bit1 ^ bit2;
            carry = (carry & bit1) | (carry & bit2) | (bit1 & bit2);
            System.out.println("sum ->" + sum + " carry ->" + carry);
            str.append(sum);
        }
        if (carry != 0) str.append(carry);
        System.out.println("str -->" + str.reverse().toString() + " sum from BIgint ->" + addBinary(s1, s2));
    }

    public static String addBinary(String a, String b) {
        BigInteger one = new BigInteger(a, 2);
        BigInteger two = new BigInteger(b, 2);
        BigInteger sum = one.add(two);
        return sum.toString(2);
    }
}
