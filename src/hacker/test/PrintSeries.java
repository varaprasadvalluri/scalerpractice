package hacker.test;

public class PrintSeries {

    public static void main(String[] args) {
        int a = 5, b = 3, n = 5;
        int carry = a;
        for (int i = 0; i < n; i++) {
            carry += Math.pow(2, i) * b;
            System.out.print(carry+" ");
        }
        System.out.println();

    }
}
