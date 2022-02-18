package com.test.scaler.madulararthmatic;

public class LeapYear {

    public static void main(String[] args) {
        int n = 1616;

        System.out.println("Leap or not ->" + leapYear(n));
    }

    public static int leapYear(int n) {
        if (n % 400 == 0) return 1;
        if ((n % 4) == 0 && (n % 100) != 0)
            return 1;
        return 0;
    }
}
