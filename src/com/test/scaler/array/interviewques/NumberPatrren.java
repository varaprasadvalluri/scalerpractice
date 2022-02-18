package com.test.scaler.array.interviewques;

public class NumberPatrren {
    public static void main(String[] args) {
        //1
        //2 3
        //3 4 5
        //4 5 6 7
        int n = 5;
        for (int i = 1; i < n; i++) {//first itaration is i only
            int l1 = (n - i), l2 = n - l1;
            int j = i;
            while (l2 < n) {
                System.out.print(l2);
                l2++;
            }
            System.out.println("len ->" + l1 + " l2 ->" + l2);
        }

    }
}
