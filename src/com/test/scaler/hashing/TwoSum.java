package com.test.scaler.hashing;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8};
        int target = -3;
//        int[] a = {2, 7, 11, 15};
//        int t = 9;
//        int left = 0, right = a.length;
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
//        Arrays.sort(a);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]))
                System.out.println("two Sum ->" + Arrays.toString(new int[]{map.get(target - nums[i]) + 1, i + 1}));
            else if (!map.containsKey(nums[i]))
                map.put(nums[i], i);
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int sum = target - nums[i];
            if (set.contains(sum))
                System.out.println("two Sum 2222  ->" + Arrays.toString(new int[]{sum + 1, i + 1}));
            else set.add(nums[i]);
        }
        System.out.println("two Sum 222 ->" + Arrays.toString(ans));
    }
}
