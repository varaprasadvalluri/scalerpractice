package com.test.scaler.array.interviewques;

import java.math.BigDecimal;

public class ProductOfStrLeetCode {
    public static void main(String[] args) {

        String str1 = "498828660196";
        String str2 = "840477629533";
        System.out.println("p ->" + multiply(str1, str2));
    }

    public static String multiply(String str1, String str2) {
        return ("" + (new BigDecimal(str1).multiply(new BigDecimal(str2))));

//        return "" + ();
    }

}
