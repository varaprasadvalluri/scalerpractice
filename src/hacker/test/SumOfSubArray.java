package hacker.test;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfSubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        int sum, count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] * (i + 1) * (n - i);
            if (sum < 0) count++;
        }
        System.out.println("arr -->" + Arrays.toString(arr) + " count -->" + count);
    }
}
