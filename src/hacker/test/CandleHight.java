package hacker.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CandleHight {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3, 2, 1, 3);
        int max = arr.stream().mapToInt(i -> i).max().getAsInt();
        System.out.println("max is -->" + max);
        int count = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == max) count++;
        }
        System.out.println("count is -->" + count);
    }
}
