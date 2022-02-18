package com.test.scaler.string;

import java.util.HashMap;
import java.util.Map;

public class BobFreq {
    public static void main(String[] args) {
        String str = "bobob";
        int j = str.indexOf("bob", -1);
        int count = 0;
        while (j != -1) {
            System.out.println("j -->" + j);
            count++;
            j = str.indexOf("bob", j + 1);
        }
        System.out.println("count ->" + count);
    }

}

