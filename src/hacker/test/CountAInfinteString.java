package hacker.test;

public class CountAInfinteString {
    public static void main(String[] args) {
        String str = "aba";
        int n = 10;
        if (str.equals("a")) System.out.println("n -->" + n);
        int[] aFrq = new int[1];
        if (n == str.length())
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a')
                    aFrq['a' - str.charAt(i)]++;
            }
        else
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a')
                    aFrq['a' - str.charAt(i)]++;
            }
        System.out.println("afrq -->" + aFrq);
    }
}
