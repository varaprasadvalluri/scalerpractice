package hacker.test;

import java.util.*;

public class FrequancyOfChar {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("ab", "ab", "abc");
        List<String> queries = Arrays.asList("ab", "abc", "bc");
        Map<String, Integer> frqMap = new HashMap<>();
        List<Integer> ansList = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            String str = strings.get(i);
            System.out.println("boolean flag -->" + frqMap.containsKey(str));
            if (frqMap.containsKey(str)) frqMap.put(str, frqMap.get(str) + 1);
            else frqMap.put(str, 1);
        }
        for (int i = 0; i < queries.size(); i++) {
            if (frqMap.containsKey(queries.get(i))) ansList.add(frqMap.get(queries.get(i)));
            else ansList.add(0);
        }
        System.out.println("ansList -->" + ansList);
    }
}
