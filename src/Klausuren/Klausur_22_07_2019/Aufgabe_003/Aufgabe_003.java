package Klausuren.Klausur_22_07_2019.Aufgabe_003;

public class Aufgabe_003 {
    public static void main(String[] args) {
        System.out.println("99 = 3^" + faktoren3(99));
        System.out.println("Max t von 1 bis 100 " + maximum(100));
    }

    public static int faktoren3(int n) {
        assert (n != 0);
        int t = 0;
        while (n % 3 == 0) {
            n = n / 3;
            t++;
        }
        return t;
    }

    public static int maximum(int n) {
        assert (n > 0);
        int max = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                int t = faktoren3(i);
                if (max < t) {
                    max = t;
                }
            }
        }
        return max;
    }
}
