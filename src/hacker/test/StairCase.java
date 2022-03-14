package hacker.test;

public class StairCase {
    public static void main(String[] args) {
        int n = 6;
        for (int i = n; i > 0; i--) {

            System.out.print("#");
            for (int j = i; j < n; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
