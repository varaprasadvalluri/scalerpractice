package hacker.test;

import java.util.*;
import java.util.stream.Collectors;

public class AlnatingSubString {
    public static void main(String[] args) {
        String str = "babbscda";
        Map<Character, Integer> treeMap = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            treeMap.put(str.charAt(i), treeMap.get(str.charAt(i)) != null ? treeMap.get(str.charAt(i)) + 1 : 1);
        }
        System.out.println("treeMap -->" + treeMap);
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(arr.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()));

    }
}
