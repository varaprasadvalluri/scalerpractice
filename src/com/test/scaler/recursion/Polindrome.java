package com.test.scaler.recursion;

public class Polindrome {
    public static void main(String[] args) {
        String str = "strings";
//        System.out.println("polyd -->" + polidrom(str.toCharArray(), 0, str.length() - 1));
        Polindrome poly=new Polindrome();
        poly.polidrom(str.toCharArray(), 0, str.length() - 1);
    }


     int polidrom(char[] arr, int s, int e) {
        if (s >= e) return 1;
        if (arr[s] == arr[e]) return polidrom(arr, s + 1, e - 1);
        else return 0;
    }
}
