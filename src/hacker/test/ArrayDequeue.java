package hacker.test;

import java.util.*;

public class ArrayDequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.offer(num);
            set.add(num);
            if (deque.size() == m) {
                if (set.size() > max) max = set.size();
                int first = (int) deque.remove();
                if (!deque.contains(first)) set.remove(first);
            }
        }

        System.out.println("size of sub-array -->" + deque + " max -->" + max);
    }

}
