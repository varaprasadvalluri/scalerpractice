package hacker.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinMaxSum {
    public static void main(String[] args) {
        List<Long> list = new ArrayList<>();
        long min = list.stream().mapToLong(i -> i).min().getAsLong();
        long max = list.stream().mapToLong(i -> i).max().getAsLong();
        long sum = list.stream().mapToLong(i -> i).sum();
        System.out.println((sum - max) + " max ->" + (sum - min));
    }
}
