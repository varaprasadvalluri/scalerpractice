package com.test.scaler.array.interviewques;

import java.util.Arrays;
import java.util.List;

public class EvenOddSubArray {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9);
        int B = 65;
        int count = 0;
        int sum, len;
        for (int i = 0; i < arr.size(); i++) {
            sum = len = 0;
            for (int j = i; j < arr.size(); j++) {
                sum += arr.get(j);
                len = (j - i + 1);
                if (len % 2 == 0 && sum < B)
                    count++;
                else if (len % 2 != 0 && B < sum)
                    count++;

            }
        }
        System.out.println("count -->" + count);
    }
}
